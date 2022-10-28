package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller  // 컨트롤 이너테이션 지정.
public class MemberController {

    @Autowired  // memberRepository 클래스를 들고온다.
    private MemberRepository memberRepository;


    @GetMapping("new")  // localhost:8080/new url 주소. new html 를 호출한다.
    public String newMember()  // new 를 맵핑해서 밑에 함수를 호출한다.
    {
        // System.out.println("createMember");
        return "new";
    }

    // @GetMapping("create")  // create 는  html @PostMapping 를 보낸다
    @PostMapping("create")  // 참조 및 변경이 가능하다.
    public String createMember()
    {
        Member member = new Member("홍길동", 32, "ABC@mega.com");
        // ** 나이
        // ** 이메일
        memberRepository.save(member);   // 함수를 저장한다.
        return "create";
    }
}
