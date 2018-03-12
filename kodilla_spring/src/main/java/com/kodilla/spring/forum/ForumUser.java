package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String UserName;

    public ForumUser() {
        UserName =  "John Smith";
    }

    public String getUserName() {
        return UserName;
    }
}
