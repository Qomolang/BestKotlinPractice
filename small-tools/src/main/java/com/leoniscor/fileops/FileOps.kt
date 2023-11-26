package com.leoniscor.fileops

import java.io.File

/**
 * @author gaosong
 */
class FileOps {
    fun basic(){
        var fileAbsoluteNames: MutableList<String> = mutableListOf()
        var fileNames: MutableList<String> = mutableListOf()

        //获得目录下所有java文件路径
        val path = """/Users/gaosong/git/vocation"""
//    val path = """/Users/gaosong/git/edu-admin"""
        val systemDir = File(path)

        val fileTree = systemDir.walk()

        fileTree
            .filter { it.extension == "java" }
            .filter { !it.name.contains("Enum") }
            .forEach {
                fileAbsoluteNames.add(it.absolutePath)
                fileNames.add(it.name)
            }
    }
}

fun main() {

    val dirName = """ D:\ssh\ALPHA """.trim()
    println(dirName)

    val dirPath = File(dirName)
    val dirTree = dirPath.walk()

    val targetFiles = dirTree
        //过滤隐藏文件夹及下属文件
        .onEnter { !it.isHidden }
        //过滤得到文件
        .filter { it.isFile }
        //过滤得到非md文件
        .filter { it.extension != "md" }
        .toMutableList()

    //处理txt
    targetFiles.filter { it.extension == "txt" }
        .forEach {
            val name = it.absolutePath
            val rename = name.replace(".txt", ".md")
//            println(rename)
            val destFile = File(rename)
            it.renameTo(destFile)
        }

    targetFiles
        .filter { it.extension != "md" }


    //辅助性打印 显示所有文件的类型
//    targetFiles.forEach { println(it.extension ) }

    //辅助性打印 显示所有文件的名字
//    val fileNames = targetFiles
//        .map { it.absolutePath }
//        .toList()
//    println(fileNames.size)
//    fileNames.forEach { println(it) }

}