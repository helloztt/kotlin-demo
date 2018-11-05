package com.helloztt.demo.kotlin.type_

import java.util.*

/**
 * TODO
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-05 15:38
 */
/**
 * 变量类型推断
 */
fun typeInference(){
    val str = "abc"
    println(str)
    println(str is String)
    println(str::class)
    println(str::class.java)

//        abc
//        true
//        class kotlin.String
//        class java.lang.String

    val d = Date()
    println(d)
    println(d is Date)
    println(d::class)
    println(d::class.java)

//        Mon Nov 05 15:45:48 CST 2018
//        true
//        class java.util.Date
//        class java.util.Date

    val bool = true
    println(bool)
    println(bool::class)
    println(bool::class.java)

//        true
//        kotlin.Boolean
//        boolean

    val array = arrayOf(1,2,3)
    println(array)
    println(array is Array)
    println(array::class)
    println(array::class.java)

//        [Ljava.lang.Integer;@7b5eadd8
//        true
//        class kotlin.Array
//        class [Ljava.lang.Integer;
}

/**
 * 如果变量声明时已制定类型，则不会进行类型推断
 */
fun Int2Long(){
    val x:Int = 10
//  val y:Long = x // Type mismatch
    val y: Long = x.toLong()
}

/**
 * is 类型检测
 */
fun getLength(obj: Any): Int? {
    var result = 0
    if (obj is String) {
        // `obj` 在该条件分支内自动转换成 `String`
        println(obj::class) //class java.lang.String
        result = obj.length
        println(result)
    }
    // 在离开类型检测分支后，`obj` 仍然是 `Any` 类型
    println(obj::class) // class java.lang.Object
    return result
}

fun stringTest() {
    //原始字符串
    val rawString = """
fun helloWorld(val name : String) {
   println("Hello, world!")
}
"""
    println(rawString)
    val fooTemplateString = "$rawString has ${rawString.length} characters"
    println(fooTemplateString)
}


fun main(args: Array<String>) {
    //type
//    typeInference()
    //is
//    getLength("123")
    //string
    stringTest()
}