package com.helloztt.demo.kotlin.type_

/**
 * TODO
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-05 17:59
 */

fun String.notEmpty(): Boolean {
    return !this.isEmpty()
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // this对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}

fun <T> MutableList<T>.mswap(index1: Int, index2: Int) {
    val tmp = this[index1] // “this”对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}


fun main(args: Array<String>) {
    println("123".isEmpty())
    println("123".notEmpty())

    val mList = mutableListOf(1, 2, 3, 4, 5)
    println("Before Swap:")
    println(mList)//[1, 2, 3, 4, 5]
    mList.swap(0, mList.size - 1)
    println("After Swap:")
    println(mList)//[5, 2, 3, 4, 1]


    val mmList = mutableListOf("a12", "b34", "c56", "d78")
    println("Before Swap:")
    println(mmList)//[a12, b34, c56, d78]
    mmList.mswap(1, 2)
    println("After Swap:")
    println(mmList)//[a12, c56, b34, d78]
}