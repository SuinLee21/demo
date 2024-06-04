package com.example.demo.member;

import java.time.LocalDateTime;

public class Member {
    private String id;
    private String passwd;
    private String name;
    private int age;
    private String email;
    private LocalDateTime signuptime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getSignuptime() {
        return signuptime;
    }

    public void setSignuptime(LocalDateTime signuptime) {
        this.signuptime = signuptime;
    }
}
