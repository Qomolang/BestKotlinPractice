package com.leoniscor.collection

import com.leoniscor.model.DeptDO

class FilterAndFinder {
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