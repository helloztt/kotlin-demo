/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.helloztt.demo.java.package_import;

import com.helloztt.demo.java.HelloJava;

/**
 * TODO
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-04 17:17
 */
public class ImportJava {
    public static void main(String[] args) {
        System.out.print("import HelloJava:");
        HelloJava.main(args);
        System.out.println("----");
        System.out.print("import PackageJava:");
        PackageJava.main(args);
    }
}
