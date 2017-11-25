/*
 * Copyright (C) 2009-2016 Hangzhou 2Dfire Technology Co., Ltd. All rights reserved
 */
package com.dfire.luobosi.optional;

/**
 * Account
 * 给 OptionalTset 方法测试的类
 *
 * @author luobosi@2dfire.com
 * @since 2017-11-25
 */
public class Account {
    /** 用户id */
    private String accountId;
    /** 用户名 */
    private String username;
    /** 用户密码 */
    private String password;
    /** 用户状态 */
    private String status;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}