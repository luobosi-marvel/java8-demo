/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * ListLambda
 *
 * @author luobosi@2dfire.com
 * @since 2017-11-25
 */
public class ListLambdaTest {

    /** list 集合对象 */
    private List<String> strLists;

    @Before
    public void init() {
        this.strLists = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
    }

    /**
     * Java8 迭代集合对象
     */
    @Test
    public void java8ListIterator() {
        // java8 迭代
        strLists.forEach(n -> System.out.println(n));
        // 使用 Java 8 的方法引用更方便，方法引用由 :: 双冒号操作符表示，
        // 看起来像 C++ 的作用域解析运算符
        strLists.forEach(System.out::println);
    }

    /**
     * Java8 过滤集合对象
     * filter 中就是过滤的条件，本例中就是只放行 Lamdbas 和 Stream API 即 strings["Lambdas", "Stream API"]
     */
    @Test
    public void java8ListFilter() {
        List<String> strings = strLists
                .stream()
                .filter(str -> "Lambdas".equals(str) || "Stream API".equals(str))
                .collect(Collectors.toList());
        // 遍历
        strings.forEach(System.out::println);
    }

}