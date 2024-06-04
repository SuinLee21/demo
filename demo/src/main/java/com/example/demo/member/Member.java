package com.example.demo.member;

import java.time.LocalDateTime;

public class Member {
    private String id;
    private String pw;
    private String name;
    private int age;
    private String email;
    private LocalDateTime signupTime;

    public Member() {
    }

    public Member(String id, String pw, String name, int age, String email, LocalDateTime signupTime) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.email = email;
        this.signupTime = signupTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
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

    public LocalDateTime getSignupTime() {
        return signupTime;
    }

    public void setSignupTime(LocalDateTime signupTime) {
        this.signupTime = signupTime;
    }

    // @Override
    // public String toString() {
    // return "Member{" +
    // "id='" + id + '\'' +
    // ", pw='" + pw + '\'' +
    // ", name='" + name + '\'' +
    // ", age=" + age +
    // ", email='" + email + '\'' +
    // ", signupTime=" + signupTime +
    // '}';
    // }
}

// public class Member {
// private String id;
// private String passwd;
// private String name;
// private int age;
// private String email;
// private LocalDateTime signuptime;

// public String getId() {
// return id;
// }

// public void setId(String id) {
// this.id = id;
// }

// public String getPasswd() {
// return passwd;
// }

// public void setPasswd(String passwd) {
// this.passwd = passwd;
// }

// public String getName() {
// return name;
// }

// public void setName(String name) {
// this.name = name;
// }

// public int getAge() {
// return age;
// }

// public void setAge(int age) {
// this.age = age;
// }

// public String getEmail() {
// return email;
// }

// public void setEmail(String email) {
// this.email = email;
// }

// public LocalDateTime getSignuptime() {
// return signuptime;
// }

// public void setSignuptime(LocalDateTime signuptime) {
// this.signuptime = signuptime;
// }
// }
