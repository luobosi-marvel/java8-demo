/*
 * Copyright (C) 2009-2018 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.map;

/**
 * Man
 *
 * @author luobosi@2dfire.com
 * @since 2018-11-06
 */
public class Man {

    private String name;

    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
