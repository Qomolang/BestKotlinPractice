package com.leoniscor.model

class DeptDO(deptId: Long, deptName: String) {

    var staffNumber: Int = 0
        get() = 2 * 8

    var deptId: Long = 0

    var deptName: String = ""

    /**
     * 部门主管
     */
    var master: String? = null

}
