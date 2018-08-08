/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.optional;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * OptionalTest
 * Java8 中的 Optional 方法进行测试，其实就是写些小 demo
 * Optional 是 Java8 提供优雅解决 NullPointerException 的问题
 *
 * @author luobosi@2dfire.com
 * @since 2017-11-25
 */
public class OptionalTest {

    @Test
    public void tessss() {


        List<DishImageVO> dishImageVOS = new ArrayList<>(Arrays.asList(new DishImageVO(1), new DishImageVO(5), new DishImageVO(45)));
        Comparator<DishImageVO> comparator = Comparator.comparing(DishImageVO::getAge);
        List<DishImageVO> sortDishImageVOS = dishImageVOS.stream().sorted(comparator).collect(Collectors.toList());
        sortDishImageVOS.forEach(System.out::println);
    }

    @Test
    public void tessssss() {
        System.out.println(TimeZone.getDefault().getRawOffset());
        long zero = System.currentTimeMillis() / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();

        System.out.println(zero);
    }
}