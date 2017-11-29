/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.optional;

import java.util.Optional;

/**
 * Person
 *
 * @author luobosi@2dfire.com
 * @since 2017-11-29
 */
public class Person {
    private Optional<Car> car;

    public Person(Optional<Car> car) {
        this.car = car;
    }

    /**
     * 人可能有车，也可能没有车，因此将字段生命为 Optional
     *
     * @return 返回一个 Optional 对象
     */
    public Optional<Car> getCar() {
        return car;
    }

    public String getCarInsuranceName(Optional<Person> person) {
        // 如果 Optional 的结果值为空，设置默认值
        return person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }

    public static void main(String[] args) {
        Insurance insurance = new Insurance("世界上最牛逼的保险公司");
        // 依据一个非空值创建 Optional
        Car car = new Car(Optional.of(insurance));
        Person person = new Person(Optional.of(car));
        System.out.println(person.getCarInsuranceName(Optional.of(person)));
    }
}

/**
 * 汽车
 */
class Car {
    /**
     * 给汽车买保险
     */
    private Optional<Insurance> insurance;

    public Car(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }

    /**
     * 车可能进行了保险，也可能没有保险，所以将这个字段声明为 Optional
     *
     * @return 返回一个 Optional 对象
     */
    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}

/**
 * 保险公司
 */
class Insurance {
    /**
     * 名字
     */
    private String name;

    public Insurance(String name) {
        this.name = name;
    }

    /**
     * 保险公司必须有名字
     *
     * @return 返回保险公司的名字
     */
    public String getName() {
        return name;
    }
}