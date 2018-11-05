package com.helloztt.demo.kotlin.package_import

import com.helloztt.demo.kotlin.otherpackage.OtherPackageKotlin
//import com.helloztt.demo.kotlin.otherpackage.what
import what

/**
 * 1、同级包命名空间下可直接调用，无需import
 * 2、如果我们不定义package命令空间，则默认在根级目录。
 * @author helloztt
 * @version V1.0
 * @since 2018-11-04 17:18
 */
fun main(args: Array<String>) {
    OtherPackageKotlin().print()
    what()
}
