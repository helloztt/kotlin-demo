package com.helloztt.demo.kotlin.package_import

/**
 * 目录与包的结构无需匹配，源代码可以在文件系统的任意位置
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-04 17:07
 */
/**
 * 包级函数
 */
fun what(){
    println("This is WHAT ?")
}

class PackageKotlin{
    fun print(){
        println("Hello,Package!")
    }
}

fun main(args:Array<String>){
    what()
    PackageKotlin().print()
}