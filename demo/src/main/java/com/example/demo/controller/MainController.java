package com.example.demo.controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController // 이 클래스가 RESTful API를 처리하는 컨트롤러임을 나타냅니다.
public class MainController {

    @Autowired // MemberService 인스턴스를 주입받기 위해 사용됩니다.
    private MemberService memberService;

    // API 호출 방법 : 브라우저 주소창에 http://localhost:8080/hello?name=홍길동

    @PostMapping("/signIn")
    public ResponseEntity<String> singIn(
            @RequestBody Map<String, Object> param) {
        String id = param.get("id").toString();
        String pw = param.get("pw").toString();

        try {
            memberService.signIn(id, pw);
        } catch (NoSuchElementException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("로그인 성공");
    }

    @GetMapping("/member")
    public ResponseEntity<Member> getMemberInfo(@RequestParam("memberId") String memberId) {
        Member member;
        try {
            member = memberService.getMemberById(memberId);
        } catch (NoSuchElementException e) {
            return ResponseEntity.badRequest().body(null);
        }
        return ResponseEntity.ok(member);
    }

    @PatchMapping("/member")
    public ResponseEntity<String> updateMemeber(@RequestBody Member member) {
        try {
            System.out.println(member.toString());
            memberService.updatMember(member);
        } catch (DuplicateKeyException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("수정 성공");
    }

    @GetMapping("/members")
    public ResponseEntity<List<Member>> getMemberList() {
        List<Member> list = memberService.getMemberList();
        return ResponseEntity.ok(list);
    }
}