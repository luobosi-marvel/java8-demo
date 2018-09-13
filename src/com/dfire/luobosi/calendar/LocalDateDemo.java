/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.calendar;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/**
 * LocalDateDemo
 * LocalDate 类 API 练习
 * 该类的实例是一个不可变的对象，类似于 String 类，它只提供简单的日期，并不包含当天的时间。
 * 另外它也不附带任何与时区相关的信息。
 *
 * @author luobosi@2dfire.com
 * @since 2018-03-16
 */
public class LocalDateDemo {

    public static void main(String[] args) {
        // 获取当前日期 2018-3-16
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        // 获取年份
        int year = localDate.getYear();
        // 获取当前这一天是今天中的第几天
        int dayOfYear = localDate.getDayOfYear();
        // 获取该月份的枚举
        Month month = localDate.getMonth();
        // 获取月份
        int monthValue = localDate.getMonthValue();
        // 获取今天是这个月的第几天（也就是多少号）
        int dayOfMonth = localDate.getDayOfMonth();
        // 获取今天是一周的第几天（就是星期几）
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("getYear:" + year + " " + "getDayOfYear:" + dayOfYear + " getMonth:" + month + " getMonthValue:" + monthValue + " getDayOfMonth:" + dayOfMonth + " dayOfWeek:" + dayOfWeek);

        System.out.println("是否是闰年: " + localDate.isLeapYear());
        System.out.println("今年有多少天：" + localDate.lengthOfYear());
        System.out.println("这个月有多少天：" + localDate.lengthOfMonth());

        ////////////////// 下面是对日期进行修改操作。
        /////////////////   添加
        // 将 2018-3-16 往后 +3 年 则    —— 2021-03-16
        LocalDate localDate1 = localDate.plusYears(3);
        System.out.println(localDate1.toString());
        // 将 2018-3-16 的月份 +22 个月  —— 2020-01-16
        localDate1 = localDate.plusMonths(22);
        System.out.println(localDate1.toString());
        // 将 2018-3-16 的天数 + 66 天   —— 2018-05-21
        localDate1 = localDate.plusDays(66);
        System.out.println(localDate1.toString());
        // 将 2018-3-16 + 5周            —— 2018-04-20
        localDate1 = localDate.plusWeeks(5);
        System.out.println(localDate1.toString());

        /////////////////   with 操作
        // 将指定年份替换当前年份重新构造出一个 LocalData 对象 —— 0004-03-16
        localDate1 = localDate.withYear(4);
        System.out.println(localDate1.toString());
        // 将指定月份替换当前月份重新构造出一个 LocalData 对象 —— 2018-04-16
        localDate1 = localDate.withMonth(4);
        System.out.println(localDate1);
        // 将指定一年天数替换当前指定天数重新构造出一个 LocalData 对象 —— 2018-01-04
        localDate1 = localDate.withDayOfYear(4);
        System.out.println(localDate1);
        // 将指定月份中天数替换当前月份指定天数重新构造出一个 LocalData 对象 —— 2018-03-04
        localDate1 = localDate.withDayOfMonth(4);
        System.out.println(localDate1);
    }


    @Test
    public void test() {
        long l = System.currentTimeMillis() / 1000;
        System.out.println(l);
    }


    /**
     * 将时间戳转换为时间对象
     */
    @Test
    public void stampToDate() {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long lt = new Long(1522671048911L);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);

        System.out.println(res);

        System.out.println(LocalDate.now().toString());
    }
}