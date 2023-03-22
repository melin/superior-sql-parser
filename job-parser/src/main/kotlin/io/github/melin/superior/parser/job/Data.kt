package io.github.melin.superior.parser.job

import io.github.melin.superior.common.Statement

data class JobData(
    val resourceName: String,
    val className: String,
    val params: List<String>?) : Statement()