package com.example.demo.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // Mybatis의 데이터 베이스와의 연동을 위한 인터페이스에 지정하며 SQL 매핑파일(XML)과 매핑 작업을 처리한다.
public interface MemberMapper {
    public Member getMember(@Param("id") String id, @Param("pw") String pw);

    public Member getMemberById(@Param("id") String id);

    public Member updateMember(Member member);

    public List<Member> getMemberList();
}
