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

    /**
     * 按照key去重
     * java中需要自己实现该功能
     */
    fun distinctByKey(input: List<DeptDO>){
        input.distinctBy { it.deptId }
    }

}