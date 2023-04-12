package io.github.melin.superior.parser.mysql.type

import io.github.melin.superior.common.type.AbsNumericType

data class IntegerType(val length: Int) : AbsNumericType() {
    companion object {
        val MAX_LENGTH: Int = 255
    }
}

data class SmallIntType(
    val length: Int,
    val unsigned: Boolean = false,
    val zerofill: Boolean = false) : AbsNumericType() {
    companion object {
        val MAX_LENGTH: Int = 255
    }
}

data class TinyintType(
    val length: Int,
    val unsigned: Boolean = false,
    val zerofill: Boolean = false) : AbsNumericType() {
    companion object {
        val MAX_LENGTH: Int = 255
    }
}

data class MediumIntType(
    val length: Int,
    val unsigned: Boolean = false,
    val zerofill: Boolean = false) : AbsNumericType() {
    companion object {
        val MAX_LENGTH: Int = 255
    }
}

data class IntType(
    val length: Int,
    val unsigned: Boolean = false,
    val zerofill: Boolean = false) : AbsNumericType() {

    companion object {
        val MAX_LENGTH: Int = 255
    }
}

data class BigIntType(
    val length: Int,
    val unsigned: Boolean = false,
    val zerofill: Boolean = false) : AbsNumericType() {
    companion object {
        val MAX_LENGTH: Int = 255
    }
}

data class DecimalType(
    val precision: Int = 10,
    val scale: Int = 0) : AbsNumericType() {
}

data class FloatType(
    val precision: Int,
    val scale: Int = 0) : AbsNumericType() {
}

data class RealType(
    val precision: Int,
    val scale: Int = 0) : AbsNumericType() {
}

data class BitType(val length: Int) : AbsNumericType() {
}


