/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.optional;

/**
 * DishImageVO
 *
 * @author luobosi@2dfire.com
 * @since 2018-07-09
 */
public class DishImageVO {

    private Integer age;

    public DishImageVO(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "DishImageVO{" +
                "age=" + age +
                '}';
    }
}