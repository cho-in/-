package com.example.demo.relation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private AcademyRepository academyRepository;


    public void insertMember(MemberDto dto)
    {
        memberRepository.insertMember(
                new Member(dto.getmemberName()));
    }

    public void insertAcademy(Academy dto)
    {
        memberRepository.insertAcademy(
                new Academy(dto.getacademyName()));
    }

    public List<Member> findALL() {
        return memberRepository.findAll();
    }

    public List<Member> findName(com.example.demo.dto.MemberDto dto) {
        return memberRepository.findName(dto.getUsername());
    }

    public ArrayList<Academy>() {return AcademyRepository.findAll();
    }

    public new ArrayList<Academy>findName(com.example.demo.dto.AcademyDto dto) {
        return AcademyRepository.findName(dto.getacademyName());
    }

}
