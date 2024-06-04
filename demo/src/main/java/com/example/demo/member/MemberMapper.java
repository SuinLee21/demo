package com.example.demo.member;

import org.springframework.stereotype.Component;

// 13주차 이론
@Component
public class MemberMapper {
    public Member getMemberByName(String name) {
        int age;
        if (name.equals("홍길동")) {
            age = 12;
        } else if (name.equals("이순신")) {
            age = 40;
        } else if (name.equals("강조")) {
            age = 10;
        } else if (name.equals("소배압")) {
            age = 20;
        } else {
            return null;
        }
        Member member = new Member();
        member.setName(name);
        member.setAge(age);
        return member;
    };
}
