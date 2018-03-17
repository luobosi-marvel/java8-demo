/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
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
     * 把一个集合里面的元素添加到另一个集合里面
     */
    @Test
    public void listToList() {
        List<String> list = new ArrayList<>();

        strLists.forEach(n -> list.add(n));
        list.forEach(System.out::println);
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

    /**
     * 计算集合元素的最大值、最小值、总和\平均值以及个数
     *
     * IntStream、LongStream 和 DoubleStream 等流的类中，有个非常有用的方法叫做 summaryStatistics() 。
     * 可以返回 IntSummaryStatistics、LongSummaryStatistics 或者 DoubleSummaryStatistic s，描述流中元
     * 素的各种摘要数据。在本例中，我们用这个方法来计算列表的最大值和最小值。它也有 getSum() 和
     * getAverage() 方法来获得列表的所有元素的总和及平均值。
     */
    @Test
    public void java8ListCalculate() {
        //获取数字的个数、最小值、最大值、总和以及平均值
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        // 使用java8 中的方法操作集合
        IntSummaryStatistics statistics = primes.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("Highest prime number in List : " + statistics.getMax());
        System.out.println("Lowest prime number in List : " + statistics.getMin());
        System.out.println("Sum of all prime numbers : " + statistics.getSum());
        System.out.println("Average of all prime numbers : " + statistics.getAverage());
        System.out.println("Count of all prime numbers : " + statistics.getCount());
    }

}