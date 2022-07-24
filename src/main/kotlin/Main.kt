import com.leoniscor.model.DeptDO

fun main(args: Array<String>) {
    println("Hello World!")
    var deptDO = DeptDO(2L,"abc")
    deptDO.deptId = 3L

    println(deptDO.deptId)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}