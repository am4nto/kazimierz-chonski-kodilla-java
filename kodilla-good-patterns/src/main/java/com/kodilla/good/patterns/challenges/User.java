package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String realName;

    public User(String userName, String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {

        return realName;
    }
}
