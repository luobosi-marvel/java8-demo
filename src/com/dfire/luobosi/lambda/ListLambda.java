/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * ListLambda
 *
 * @author luobosi@2dfire.com
 * @since 2017-11-25
 */
public class ListLambda {

    /** list 集合对象 */
    private List<String> strLists;
    /** 没有参数的构造方法 */
    public ListLambda() {
        this.strLists = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
    }

    public static void main(String[] args) {
        ListLambda listLambda = new ListLambda();
        listLambda.java8Iterator();
    }

    /**
     * Java8 迭代集合对象
     */
    public void java8Iterator() {
        // java8 迭代
        strLists.forEach(n -> System.out.println(n));
        // 使用 Java 8 的方法引用更方便，方法引用由 :: 双冒号操作符表示，
        // 看起来像 C++ 的作用域解析运算符
        strLists.forEach(System.out::println);
    }



}