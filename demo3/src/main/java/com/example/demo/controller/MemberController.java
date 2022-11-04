package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.dto.MemberDto;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller  // 컨트롤 이너테이션 지정.
public class MemberController {

    @Autowired  // memberRepository 클래스를 들고온다.
    private MemberService memberService;

    @GetMapping("new")  // localhost:8080/new url 주소. new html 를 호출한다.
    public String newMember() {return "new";} // new 를 맵핑해서 밑에 함수를 호출한다.

    @PostMapping("create")  // 전체 멤버 조회.
    public String createmMember(@Valid member dto)  // <p><a href="/findAll">회원조회</a> </p> html index
    {
        List<Member> members = memberService.findName(dto);   // 전체 회원 정리. 이름으로 회원찾기.
        model.addAttribute("object", members);
        return "findName";  // findAll html
    }




    // @GetMapping("create")  // create 는  html @PostMapping 를 보낸다
    @PostMapping("findName")  // 참조 및 변경이 가능하다.
    public String createMember(Model model, MemberDto dto)
    {
        //Member member = new Member("홍길동", 32, "ABC@mega.com");
        // Member member = new Member("홍길동");
        memberService.insertMember(dto);
        model.addAttribute("object", members);
        // ** 나이
        // ** 이메일
           // 함수를 저장한다.
        return "findAll";   // redirect 는 홈으로 보낸다.
    }
    // ========================================

    @PostMapping("findName")  // 전체 멤버 조회.
    public String findName(Model model, MemberDto dto)  // <p><a href="/findAll">회원조회</a> </p> html index
    {
        List<Member> members = memberService.findName(dto);   // 전체 회원 정리. 이름으로 회원찾기.
        model.addAttribute("object", members);
        return "findName";  // findAll html
    }

    @GetMapping("findAll")   // 회원 조회.
    public String findAll(Model model)
    {
        List<Member> members = memberService.findALL();   // 전체 회원 정리.  List.<???> 여러개의 데이터를 접근할때 쓰인다.
        model.addAttribute("object", members); //
        return "findAll";
    }

    @GetMapping("deleteMember")   // 회원 탈퇴.
    public String deleteMember()
    {
        return "deleteMember";
    }

    @GetMapping("deleteMember")   // 회원 탈퇴 및 조회.
    public String deleteMember(String username)
    {
        memberService.deleteMember(username);
        return "redirect:/";
    }

}
