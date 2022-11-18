package com.example.demo.relation.view;


import com.example.demo.relation.OrderService;
import com.example.demo.relation.domain.Academy;
import com.example.demo.relation.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional(readOnly = true)
@Controller
public class RelationController {

    @Autowired
    private OrderService orderService;

    @PersistenceContext
    private EntityManager em;


    @Transactional()
    @GetMapping("main")
    public String insert() // dto 가 멤버를 만들어준다. 필드값이 다수일 경우 하나로 초기화하는 복사생성자여야 한다.
    {
        // MemberDto dto
        Academy academy1 = new Academy("메가스터디학원");  // 서비스 계층으로 넘겨준다.Dto 로 받아서 넘겨준다.
        Academy academy2 = new Academy("메가학원");
        Academy academy3 = new Academy("서면학원");

                                // 복사 생성자 2개 값을 초기화.
        Member member = new Member("홍길동",academy2);    // 객체(Entity)  정보화된 내용 전달 (오더의 역활) new 초기화.
        //academy3.addMember(member);   // 멤버안에 집어넣음.

        orderService.insert(member);
        // 멤버 서비스 계층에서 한다.(회원가입 및 회원정보 변경)


        return "redirect:/";
    }
}
