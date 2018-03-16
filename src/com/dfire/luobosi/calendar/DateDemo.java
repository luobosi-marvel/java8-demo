/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * DateDemo
 *
 * @author luobosi@2dfire.com
 * @since 2018-03-15
 */
public class DateDemo {

    public static void main(String[] args) {
        // 2018-03-15
        LocalDate now = LocalDate.now();
        System.out.println(now);

        long milli = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()/1000;
        System.out.println(milli);
    }

}