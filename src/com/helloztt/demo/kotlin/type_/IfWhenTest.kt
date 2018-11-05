package com.helloztt.demo.kotlin.type_

import java.lang.Integer.parseInt

/**
 * TODO
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-05 16:24
 */
class IfWhenTest {
    fun max(a: Int, b: Int): Int {
        // 作为表达式
//        val max = if (a > b) a else b
//        return max
        return if (a > b) a else b
    }

    fun max2(a: Int, b: Int): Int {// With else
        val max2: Int
        if (a > b) {
            max2 = a
        } else {
            max2 = b
        }
        return max2
    }

    /**
     * 最后的表达式作为该块的值
     */
    fun max3(a: Int, b: Int): Int {
        val max = if (a > b) {
            print("Max is a")
            a
        } else {
            print("Max is b")
            b
        }
        return max
    }

    /**
     * when
     */
    fun cases(obj: Any) {
        val s = "123"
        when (obj) {
        //多分支需要用相同的方式处理，则可以把多个分支条件放在一起，用逗号分隔
            1, -1 -> print("第一项")
            "hello" -> print("这个是字符串hello")
            is Long -> print("这是一个Long类型数据")
            parseInt(s) -> print("obj is 123")
            !is String -> print("这不是String类型的数据")
            else -> print("else类似于Java中的default")
        }
    }

    fun caseInt(x: Int) {
        val validNumbers = arrayOf(-1, -2, -3)
        when (x) {
            in 1..10 -> println("x is in the range 1-10")
            in validNumbers -> println("x is valid")
            !in 10..20 -> println("x is outside the range 10-20")
            else -> println("none of the above")
        }
    }
}


fun main(args: Array<String>) {
    val ifWhenTest = IfWhenTest()
    val a = 1
    val b = 2
    println(ifWhenTest.max(a, b))
    println(ifWhenTest.max2(a, b))
    println(ifWhenTest.max3(a, b))
    //---------
    ifWhenTest.cases(a)
    println()
    ifWhenTest.cases("hello")
    println()
    ifWhenTest.cases(123)
    println()
    ifWhenTest.cases(b)
    println()
    ifWhenTest.cases("1")
    println()
    //-------
    ifWhenTest.caseInt(1)
    ifWhenTest.caseInt(10)
    ifWhenTest.caseInt(20)
    ifWhenTest.caseInt(21)
    ifWhenTest.caseInt(-1)
}