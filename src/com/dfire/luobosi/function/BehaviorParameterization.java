/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.function;

import com.dfire.luobosi.constant.Constants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * BehaviorParameterization
 * 将行为参数化
 *
 * @author luobosi@2dfire.com
 * @since 2017-11-25
 */
public class BehaviorParameterization {

    /**
     * 过滤器方法的实现
     *
     * @param inventory  apple 集合
     * @param predicate  谓词对象（即传入 test 方法的实现即可）
     * @return           过滤之后的集合对象
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> list = new ArrayList<>(8);
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                list.add(apple);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple(Constants.Color.GREEN), new Apple(Constants.Color.RED),
                new Apple(Constants.Color.BLUE), new Apple(Constants.Color.YELLOW));
        // 这里第二个参数就相当于将行为参数化，就相当于 test 方法的实现
        List<Apple> appleList = filterApples(list, apple -> Constants.Color.GREEN.equals(apple.getColor()));
        // 遍历
        appleList.forEach(System.out::println);
    }
}