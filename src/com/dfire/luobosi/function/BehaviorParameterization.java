/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.function;

import com.dfire.luobosi.constant.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * BehaviorParameterization
 * 将行为参数化
 *
 * @author luobosi@2dfire.com
 * @since 2017-11-25
 */
public class BehaviorParameterization implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        if (Constants.Color.GREEN.equals(apple.getColor())) {
            return true;
        }
        return false;
    }

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
        Apple appleGreen = new Apple(Constants.Color.GREEN);
        Apple appleRed = new Apple(Constants.Color.RED);
        Apple appleBlue = new Apple(Constants.Color.BLUE);
        Apple appleYellow = new Apple(Constants.Color.YELLOW);

        List<Apple> list = new ArrayList<>(4);
        list.add(appleGreen);
        list.add(appleRed);
        list.add(appleBlue);
        list.add(appleYellow);

        List<Apple> appleList = filterApples(list, apple -> Constants.Color.GREEN.equals(apple.getColor()));


    }
}