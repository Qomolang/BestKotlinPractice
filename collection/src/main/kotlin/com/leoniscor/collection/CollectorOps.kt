package com.leoniscor.collection

import com.leoniscor.model.DeptDO

/**
 * kotlin的流脱胎于java，但很多时候都更简洁，因此单开
 */
class CollectorOps {

    fun list2list(input: List<DeptDO>): List<DeptDO> {
        val list = input.filter { it.deptId == 1L }
        return list
    }


    fun toMapGroupBy(input: List<DeptDO>): Map<Long, List<DeptDO>> {
        val byDept = input.groupBy { it.deptId }
        return byDept
    }

    /**
     * 性能更好 associateBy 函数，该函数接受两个lambdas来生成键和值，并内联 Map 的创建：
     */
    fun map2listV1(input: List<DeptDO>){
        val map = input.associateBy({it.deptId}, {it.deptName})
    }

    /**
     * 1. 使用标准的 map 函数来创建 Pair 的列表
     * 2. 使用toMap 可以生成最终的映射
     */
    fun map2listV2(input: List<DeptDO>){
        val map = input.map { it.deptId to it.deptName }
            .toMap()

    }
}