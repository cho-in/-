package com.example.demo.relation.domain.service;


import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true) // getter 와같다. @Transactional 사용은 필수다.
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional // 변경사항에 대한 저장 및 롤백
    public void insert(Member member)
    {
        memberRepository.save(member);
    }

    public List<Member> findByLoginId(String loginId)
    {
        return memberRepository.findByLoginId(loginId);
    }



}
