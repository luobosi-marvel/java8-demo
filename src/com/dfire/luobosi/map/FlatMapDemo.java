/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * FlatMapDemo
 *
 * @author luobosi@2dfire.com
 * @since 2018-11-06
 */
public class FlatMapDemo {

    public static void main(String[] args) {

        People people4 = new People();
        people4.setManList(Arrays.asList(new Man("marvel", 21), new Man("marvel1", 22), new Man("marvel2", 23), new Man("marvel4", 24)));

        People people1 = new People();
        people1.setManList(Arrays.asList(new Man("luobosi", 11), new Man("luobosi2", 12), new Man("luobosi3", 13), new Man("luobosi4", 14)));

        People people2 = new People();
        people2.setManList(Arrays.asList(new Man("jane", 31), new Man("wangwu", 32), new Man("zhaoliu", 33), new Man("lisi", 34)));

        People people3 = new People();
        people3.setManList(Arrays.asList(new Man("duoduo", 41), new Man("qiezi", 42), new Man("zhutou",43), new Man("lihao", 44)));

        List<People> peopleList = new ArrayList<>();
        peopleList.add(people4);
        peopleList.add(people1);
        peopleList.add(people2);
        peopleList.add(people3);


        // 筛选出名字长度大于 5 的男人
        Set<String> set = peopleList.stream()
                .flatMap(people -> people.getManList().stream())
                .filter(man -> man.getName().length() < 5)
                .map(Man::getName).collect(Collectors.toSet());
        set.forEach(System.out::println);

        System.out.println("================");
        // 筛选出年纪大于 20 的男人
        Set<String> manSet = peopleList.stream()
                .flatMap(people -> people.getManList().stream())
                .filter(man -> man.getAge() > 20)
                .map(Man::getName).collect(Collectors.toSet());
        manSet.forEach(System.out::println);
    }

}
