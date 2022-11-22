package com.example.demo.relation.domain.service;


import com.example.demo.relation.domain.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

    @Autowired
    private MemberService memberService;

    @Transactional
    public void insert(Member member)
    {
        .insert(member);
    }
}
