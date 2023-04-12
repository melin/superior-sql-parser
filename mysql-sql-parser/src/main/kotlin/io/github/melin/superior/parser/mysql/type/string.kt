package io.github.melin.superior.parser.mysql.type

import io.github.melin.superior.common.type.AbsStringType
import io.github.melin.superior.common.type.Type

data class CharType(val length: Int) : AbsStringType() {
    companion object {
        val MAX_LENGTH: Int = 255
    }
}

data class VarcharType(val length: Int) : AbsStringType() {
    companion object {
        val MAX_LENGTH: Int = 65535
    }
}

data class BinaryType(val length: Int) : AbsStringType() {
    companion object {
        val MAX_LENGTH: Int = 255
    }
}

data class VarbinaryType(val length: Int) : AbsStringType() {
    companion object {
        val MAX_LENGTH: Int = 65535
    }
}

class TinyblobType : AbsStringType()
class BlobType : AbsStringType()
class MediumblobType : AbsStringType()
class LongblobType : AbsStringType()

class TinytextType : AbsStringType()
class TextType : AbsStringType()
class MediumtextType : AbsStringType()
class LongtextType : AbsStringType()

data class EnumType(val values: List<String>) : AbsStringType()

data class SetType(val values: List<String>) : AbsStringType()
