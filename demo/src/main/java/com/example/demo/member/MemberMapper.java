package com.example.demo.member;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

// 13주차 이론
// @Component
// public class MemberMapper {
// public Member getMemberByName(String name) {
// int age;
// if (name.equals("홍길동")) {
// age = 12;
// } else if (name.equals("이순신")) {
// age = 40;
// } else if (name.equals("강조")) {
// age = 10;
// } else if (name.equals("소배압")) {
// age = 20;
// } else {
// return null;
// }
// Member member = new Member();
// member.setName(name);
// member.setAge(age);
// return member;
// };
// }

@Component
public class MemberMapper {

    private List<Member> members = new ArrayList<>();

    public MemberMapper() {
        // Add some sample data
        members.add(new Member("id001", "pwd001", "John Doe", 30,
                "john.doe@example.com", LocalDateTime.now()));
        members.add(new Member("id002", "pwd002", "Park", 25, "Park@example.com",
                LocalDateTime.now()));
    }

    public Member getMemberByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public Member getMemberById(String id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public List<Member> getMemberList() {
        return new ArrayList<>(members);
    }

    public int insert(Member member) {
        if (getMemberById(member.getId()) == null) {
            members.add(member);
            return 1;
        }
        return 0;
    }

    public int update(Member member) {
        Optional<Member> existingMember = members.stream()
                .filter(m -> m.getId().equals(member.getId()))
                .findFirst();

        if (existingMember.isPresent()) {
            Member m = existingMember.get();
            // m.setPw(member.getPw());
            m.setName(member.getName());
            m.setAge(member.getAge());
            m.setEmail(member.getEmail());
            // m.setSignupTime(member.getSignupTime());
            return 1;
        }
        return 0;
    }
}
// @Mapper // Mybatis의 데이터 베이스와의 연동을 위한 인터페이스에 지정하며 SQL 매핑파일(XML)과 매핑 작업을 처리한다.
// public interface MemberMapper {
// public Member getMemberByName(String name);
// }
