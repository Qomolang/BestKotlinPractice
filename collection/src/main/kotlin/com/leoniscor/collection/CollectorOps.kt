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

    fun filterOrMap(input: List<DeptDO>) {
        val output1 = input
            .map { it.deptName }

        val output2 = input
            .filter { it.deptId == 1L }

        val output = input
            .filter { it.deptId == 1L }
            .map { it.deptName }
    }



}