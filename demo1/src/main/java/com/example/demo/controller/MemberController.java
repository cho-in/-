package com.example.demo.controller;

import com.example.demo.domain.Member;
import org.springframework.stereotype.Controller;

import javax.persistence.EntityManager;

@Controller
public class MemberController {

    EntityManager em;


    public long insert(Member member)
    {
        em.persist(member);

        return 1L;
    }
}
