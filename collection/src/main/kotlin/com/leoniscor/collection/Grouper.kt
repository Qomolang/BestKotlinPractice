package com.leoniscor.collection

import com.leoniscor.model.DeptDO
import java.util.stream.Stream


class Grouper {
    /**
     * 数据分组
     *
     * @param deptDOList
     * @return
     */
    fun groupingByWith1param(input: List<DeptDO>): Map<Int, List<DeptDO>> {
        return input.groupBy(DeptDO::staffNumber)
    }

}