package com.leoniscor

/**
 * kotlin的优势：
 * 1. javac对字符串常量有要求，不允许超过65535，而kotlin编译器没这个要求
 * 2. kotlin的row String语法可以不用管转义
 */
class StringOps {
}

/**
 * 按照行分割
 */
fun splitByLine(oralText: String): List<String> {
    var output = oralText.split("\n")

    output = output.map { it.trim() }

    return output
}

/**
 * 按照空格分割
 */
fun splitByBlank(oralTextLines: List<String>): List<List<String>> {
    var output = oralTextLines
        .filter { it.isNotEmpty() }
        .map { it.split("""\s+""".toRegex()) }

    return output
}