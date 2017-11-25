/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.lambda;

/**
 * ThreadLambda
 * 使用 lambda 表达式创建一个 线程
 *
 * @author luobosi@2dfire.com
 * @since 2017-11-25
 */
public class ThreadLambda {

    /**
     * 直接使用 lambda 表达式创建一个线程，一行代码搞定
     *
     * @param args 系统参数
     */
    public static void main(String[] args) {
        new Thread(()-> System.out.println("In Java8, Lambda expression rocks !!")).start();
    }

}