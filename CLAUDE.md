# CLAUDE.md - Superior SQL Parser

This document provides guidance for AI assistants working with the Superior SQL Parser codebase.

## Project Overview

Superior SQL Parser is a multi-database SQL parsing library based on ANTLR4. It extracts metadata from SQL statements across 14 different database dialects, supporting use cases like DDL metadata extraction, SQL permission validation, table-level lineage tracking, and SQL syntax verification.

**Current Version:** 4.0.22
**License:** Apache License 2.0
**Primary Language:** Kotlin (with Java support)
**Build System:** Maven
**Java Target:** Java 8

## Repository Structure

```
superior-sql-parser/
├── pom.xml                           # Parent POM with shared configuration
├── superior-common-parser/           # Core shared module (required by all parsers)
│   └── src/main/kotlin/io/github/melin/superior/
│       ├── common/                   # Core types (StatementType, SqlType, etc.)
│       │   ├── antlr4/              # ANTLR utilities (caching, error handling)
│       │   ├── relational/          # SQL statement model classes
│       │   │   ├── create/          # CREATE statements
│       │   │   ├── drop/            # DROP statements
│       │   │   ├── alter/           # ALTER statements
│       │   │   ├── dml/             # DML (QueryStmt, InsertTable, etc.)
│       │   │   ├── table/           # Table operations
│       │   │   ├── io/              # Load/Export operations
│       │   │   ├── delta/           # Delta Lake operations
│       │   │   └── common/          # Utility statements (SET, USE, etc.)
│       │   └── util/                # Utility classes
│
├── superior-spark-parser/            # Apache Spark SQL parser
├── superior-mysql-parser/            # MySQL parser
├── superior-postgres-parser/         # PostgreSQL parser
├── superior-oracle-parser/           # Oracle parser
├── superior-flink-parser/            # Apache Flink SQL parser
├── superior-starrocks-parser/        # StarRocks parser
├── superior-presto-parser/           # Presto SQL parser
├── superior-trino-parser/            # Trino SQL parser
├── superior-redshift-parser/         # AWS Redshift parser
├── superior-sqlserver-parser/        # Microsoft SQL Server parser
├── superior-dameng-parser/           # DaMeng Database parser
├── superior-arithmetic-parser/       # Arithmetic expression parser
└── superior-appjar-parser/           # Spark JAR application parser
```

## Build Commands

```bash
# Build the project
mvn clean install

# Run tests only
mvn test

# Build specific module
mvn clean install -pl superior-spark-parser -am

# Deploy with GPG signing (releases)
export GPG_TTY=$(tty)
mvn clean deploy -Pdeploy

# Skip tests during build
mvn clean install -DskipTests
```

## Architecture

### Module Dependencies

All dialect-specific modules depend on `superior-common-parser`:

```
superior-common-parser (core)
        ↑
        └── superior-spark-parser
        └── superior-mysql-parser
        └── superior-postgres-parser
        └── superior-flink-parser
        └── ... (all other parsers)
```

### Key Design Patterns

1. **ANTLR Visitor Pattern**: Each parser uses ANTLR4 visitors (not listeners) to traverse parse trees
2. **Helper Classes**: Public API entry point per dialect (e.g., `SparkSqlHelper`, `MySQLHelper`)
3. **Data Classes**: Kotlin data classes for immutable SQL statement models
4. **Enum-based Type System**: `StatementType`, `SqlType`, `PrivilegeType`, `TableType`

### Parser Module Structure

Each dialect parser follows this pattern:

```
superior-[dialect]-parser/
├── pom.xml
├── src/main/antlr4/                  # ANTLR grammar files (.g4)
├── src/main/kotlin/
│   └── io/github/melin/superior/parser/[dialect]/
│       ├── [Dialect]SqlHelper.kt     # Public API (main entry point)
│       ├── [Dialect]Antlr4Visitor.kt # ANTLR visitor implementation
│       ├── AbstractSqlParser.kt      # Base parser (if needed)
│       └── relational/               # Dialect-specific statement classes
└── src/test/kotlin/
    └── io/github/melin/superior/parser/[dialect]/
        └── [Dialect]SqlParserTest.kt
```

## Code Conventions

### Package Structure

```
io.github.melin.superior
├── common                            # Common parser module
│   ├── antlr4                       # ANTLR utilities
│   ├── relational                   # SQL statement models
│   └── util                         # Utilities
└── parser
    └── [dialect]                    # Dialect-specific code
```

### Naming Conventions

- **Helper Classes**: `[Dialect]SqlHelper` (e.g., `SparkSqlHelper`, `MySQLHelper`)
- **Visitor Classes**: `[Dialect]Antlr4Visitor` or `[Dialect]SqlAntlr4Visitor`
- **Statement Classes**: Match SQL operation (e.g., `CreateTable`, `QueryStmt`, `InsertTable`)
- **Test Classes**: `[Dialect]SqlParser[Category]Test` (e.g., `SparkSqlParserTest`, `MySqlParserDdlTest`)

### API Methods

Each Helper class provides these standard methods:

```kotlin
// Parse single SQL statement
fun parseStatement(sql: String): Statement

// Parse multiple SQL statements
fun parseMultiStatement(sql: String): List<Statement>

// Split SQL text into individual statements
fun splitSql(sql: String): List<String>

// Validate SQL syntax
fun checkSqlSyntax(sql: String)

// Get SQL keywords for editor autocomplete
fun sqlKeywords(): List<String>
```

### Statement Type Hierarchy

All SQL statements extend the `Statement` abstract class:

```kotlin
abstract class Statement {
    abstract val statementType: StatementType
    abstract val privilegeType: PrivilegeType
    abstract val sqlType: SqlType
}
```

Key statement classes:
- `CreateTable`, `CreateDatabase`, `CreateView`, `CreateFunction`
- `DropTable`, `DropDatabase`, `DropView`
- `AlterTable`, `AlterDatabase`
- `QueryStmt` (SELECT statements)
- `InsertTable`, `UpdateTable`, `DeleteTable`, `MergeTable`

## Testing

### Test Framework

- **Framework**: JUnit 4
- **Assertions**: `org.junit.Assert`

### Test Conventions

```kotlin
class SparkSqlParserTest {
    @Test
    fun createTableTest() {
        val sql = "CREATE TABLE test.users (name STRING)"

        val statement = SparkSqlHelper.parseStatement(sql)

        if (statement is CreateTable) {
            Assert.assertEquals("test", statement.schemaName)
            Assert.assertEquals("users", statement.tableName)
        } else {
            Assert.fail()
        }
    }
}
```

### Running Tests

```bash
# Run all tests
mvn test

# Run tests for specific module
mvn test -pl superior-spark-parser

# Run specific test class
mvn test -pl superior-spark-parser -Dtest=SparkSqlParserTest

# Run specific test method
mvn test -pl superior-spark-parser -Dtest=SparkSqlParserTest#createTableTest
```

## ANTLR Grammar Files

- Location: `src/main/antlr4/` in each parser module
- Generated code: `target/generated-sources/antlr4/`
- Grammar convention: `[Dialect]Parser.g4`, `[Dialect]Lexer.g4`

### Regenerating Parsers

ANTLR code is auto-generated during Maven build:

```bash
mvn generate-sources
```

## Common Tasks

### Adding Support for New SQL Syntax

1. Update the ANTLR grammar file (`.g4`)
2. Add/modify visitor methods in `[Dialect]Antlr4Visitor.kt`
3. Create/update statement class in `relational/` if needed
4. Add tests in the test class
5. Update `StatementType` enum if adding new statement type

### Adding a New Database Dialect

1. Create new module `superior-[dialect]-parser/`
2. Add ANTLR grammar files from database project or grammars-v4
3. Implement `[Dialect]SqlHelper.kt` with standard API methods
4. Implement `[Dialect]Antlr4Visitor.kt` for parse tree traversal
5. Add module to parent `pom.xml`
6. Create comprehensive tests

### Debugging Parse Errors

The parser uses two-phase parsing (SLL then LL) for performance:

```kotlin
parser.interpreter.predictionMode = PredictionMode.SLL
try {
    // Fast SLL mode
    sqlVisitor.visitSqlStatements(parser.sqlStatements())
} catch (e: ParseCancellationException) {
    // Fall back to LL mode
    parser.interpreter.predictionMode = PredictionMode.LL
    sqlVisitor.visitSqlStatements(parser.sqlStatements())
}
```

## Key Files Reference

| File | Purpose |
|------|---------|
| `StatementType.kt` | Enum of 100+ SQL statement types |
| `SqlType.kt` | SQL classification (DDL, DML, DQL) |
| `PrivilegeType.kt` | Permission levels (CREATE, READ, WRITE, DELETE) |
| `TableId.kt` | Table identifier (catalog, schema, table name) |
| `Statement.kt` | Base class for all SQL statements |
| `QueryStmt.kt` | SELECT statement with input tables, limit, functions |
| `CreateTable.kt` | CREATE TABLE statement model |
| `AntlrCaches.java` | Parser caching for performance |
| `ParseErrorListener.java` | Custom ANTLR error handling |

## Dependencies

Key dependencies (see parent `pom.xml` for versions):

- `antlr4-runtime` - ANTLR parser runtime
- `kotlin-stdlib` - Kotlin standard library
- `commons-lang3` - Apache Commons utilities
- `guava` - Google utilities (provided scope)
- `junit` - Testing framework (test scope)
- `slf4j-api` - Logging API

## Environment Variables

- `RELEASE_ANTLR_CACHE_AFTER_PARSING`: Set to `"false"` to preserve parser caches between calls (default releases caches after each parse)

## Notes for AI Assistants

1. **Always run tests** after making changes: `mvn test -pl [module-name]`
2. **Prefer Kotlin** for new code; Java is acceptable for ANTLR utilities
3. **Use data classes** for immutable statement models
4. **Follow existing patterns** in similar dialect parsers when adding features
5. **Check StatementType enum** before adding new statement types - it may already exist
6. **Test with real SQL** from the target database documentation
7. **Grammar changes** require regeneration: `mvn generate-sources`
