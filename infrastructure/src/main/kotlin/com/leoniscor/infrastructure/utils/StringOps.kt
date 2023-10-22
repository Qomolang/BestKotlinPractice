package com.leoniscor.infrastructure.utils

object StringOps {

    val CHINESE_NUMBER: List<Char> = listOf('零', '一', '二', '三', '四', '五', '六', '七', '八', '九','十','百','千','万',)

    /**
     * 找到第n此出现的中文数字
     */
    fun getNthChineseNumber(input: String, n: Int): String {
        var temp = ""
        var times = 0
        //标记是否是连续数字中的一部分
        var expand = false
        for ((index, c) in input.withIndex()) {
            if (CHINESE_NUMBER.contains(c)) {
                if(!expand){
                    times = times + 1
                }
                expand = true
            }
            if(!CHINESE_NUMBER.contains(c)){
                expand = false
            }
            if(expand && times == n){
                temp = temp+c
            }
        }
        return temp
    }
}

fun main() {
   var output =  StringOps.getNthChineseNumber("十一",1)
    println(output)
}