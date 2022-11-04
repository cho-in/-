package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.dto.MemberDto;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional  // 변경된 사항에 대한 확인 및 반영.
@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void insertMember(MemberDto dto)
    {
        memberRepository.insertMember(
                new Member(dto.getUsername()));
    }

    public List<Member> findALL() {
        return memberRepository.findAll();
    }

    public List<Member> findName(MemberDto dto) {
        return memberRepository.findName(dto.getUsername());
    }
    public void deleteMember(String username) {
        memberRepository.deleteMember(username);
    }
}
