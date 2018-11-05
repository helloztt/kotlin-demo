package com.helloztt.demo.kotlin.val_var

/**
 * TODO
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-05 14:32
 */
class VariableVSValue {
    fun declareVar() {
        var a = 1
        a = 2
        println(a)
        println(a::class)
        println(a::class.java)

        var x = 5 // 自动推断出 `Int` 类型
        x += 1

        println("x = $x")
    }

    fun declareVal() {
        val b = "a"
//        b  = "b" //编译器会报错： Val cannot be reassigned
        println(b)
        println(b::class)
        println(b::class.java)

        val c: Int = 1  // 立即赋值
        val d = 2   // 自动推断出 `Int` 类型
        val e: Int  // 如果没有初始值类型不能省略
        e = 3       // 明确赋值
        println("c = $c, d = $d, e = $e")
    }
}

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

fun main(args: Array<String>) {
    val variableVSValue = VariableVSValue()
    variableVSValue.declareVar()
    variableVSValue.declareVal()
}