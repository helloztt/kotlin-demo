/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.helloztt.demo.java.package_import;
//package com.helloztt.demo.java.otherpackage;

/**
 * TODO
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-04 17:06
 */
public class PackageJava {

    private void print(){
        System.out.println("Hello,Package!");
    }

    public static void main(String[] args) {
        new PackageJava().print();
    }
}
