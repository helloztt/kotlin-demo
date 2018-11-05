package com.helloztt.demo.kotlin.type_

/**
 * TODO
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-05 17:20
 */
class ReturnTest {
    fun sum(a: Int,b: Int) = a + b

    //函数类型
    fun sumf(a:Int, b:Int) = {a+b}
}

fun main(args: Array<String>) {
    val returnTest = ReturnTest()
    val a = 1
    val b = 2
    println("sum:${returnTest.sum(a,b)}")
    println("sumf:${returnTest.sumf(a,b)}")
    println("sumf:${returnTest.sumf(a,b).invoke()}")
}