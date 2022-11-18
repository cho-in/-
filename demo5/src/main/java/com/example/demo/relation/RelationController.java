package com.example.demo.relation;


import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional(readOnly = true)
@Controller
public class RelationController {

    @PersistenceContext
    private EntityManager em;


    @Transactional()
    @GetMapping("main")
    public String insert()
    {
        Academy academy1 = new Academy("메가스터디학원");  // 서비스 계층으로 넘겨준다.Dto 로 받아서 넘겨준다.
        Academy academy2 = new Academy("메가학원");
        Academy academy3 = new Academy("서면학원");


        Member member = new Member("홍길동",academy2);    // 객체(Entity)  정보화된 내용 전달 (오더의 역활)
        academy3.addMember(member);   // 멤버안에 집어넣음.             // 멤버 서비스 계층에서 한다.(회원가입 및 회원정보 변경)

        em.persist(member);
        em.persist(academy1);
        em.persist(academy2);
        em.persist(academy3);

        return "redirect:/";
    }
}
