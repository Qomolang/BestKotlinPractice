package com.leoniscor

import com.leoniscor.model.DeptDO

class NullSafe {
}

/**
 * 方式一：‘?.’ 运算符
 * 非non-safe的集合，获得非non-safe的结果
 * if-not-null null则返回null
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
 * if-not-null-else
 */
fun nullSafeV3() {
    val dept: DeptDO? = null
    val a: String = dept?.master ?: "abc"
}

/**
 * 方法4：let 函数
 *
 * 适用场景，可空对象多个连续判断
 */
fun nullSafeV4() {
    val dept: DeptDO? = null

    //如果不用let
    dept?.deptId
    dept?.deptName
    dept?.master

    //用了let
    dept?.let {
        it.deptId
        it.deptName
        it.master
    }
}

/**
 * let 函数的另一种用法，指定作用域，从而在作用域内可以声明并适用更直接的变量名，无需担心该变量名会污染更大的命名空间
 */
fun letOther() {
    val dept: DeptDO? = null

    dept?.let {
        var deptId = it.deptId
        var deptName = it.deptName
        var master = it.master
    }
}

fun main() {
    letOther()
}
