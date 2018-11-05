/*
 * Copyright (c) 2001-2018 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.helloztt.demo.java.package_import;

/**
 * TODO
 *
 * @author helloztt
 * @version V1.0
 * @since 2018-11-05 16:26
 */
public class IfWhenTest {
    private int max(int a,int b){
        int max = a;
        if(a < b){
            max = b;
        }
        return max;
    }

    private void swichTest(int num){
        switch (num){
        case 0:
        case 1:
            System.out.println("0 or 1");
            break;
            default:
                System.out.println("default");
        }
    }

    public static void main(String[] args) {
        final IfWhenTest ifWhenTest = new IfWhenTest();
        ifWhenTest.swichTest(1);
    }
}