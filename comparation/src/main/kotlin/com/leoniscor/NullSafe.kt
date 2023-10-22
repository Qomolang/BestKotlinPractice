package com.leoniscor

import com.leoniscor.model.DeptDO

class NullSafe {
}

/**
 * 方式一：‘?.’ 运算符
 * 非non-safe的集合，获得非non-safe的结果
 */
fun nullSafeV1(stringList: List<String>?): List<String>? {
    return stringList?.toList()
}


/**
 * 方法二：可空接收者
 * 通过扩展方法，为Any?类型编写方法，Any?类型是所有类型（可空类型和非可空类型的父类），如果一个null值调用可空接受者，不会抛出异常
 */
fun nullSafeV2() {
    val dept: DeptDO? = null
    //toString方法就是一个可空接收者
    println(dept.toString())
}

/**
 * 方法三：Elvis 操作符：‘?:’
 *
 * ‘?.’ 运算符会得到可空结果，如果希望严格非空，则配合Elvis 操作符一起使用
 */
fun nullSafeV3() {
    val dept: DeptDO? = null
    val a: String = dept?.master ?: "abc"
}
