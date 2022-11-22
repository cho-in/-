package com.example.demo.relation.domain.member;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class MemberRepository {

    private EntityManager em;

    public void save(Member member)
    {
        em.persist(member);
    }

}
