package com.example.demo.relation;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {
    public Object insertMember;

    @PersistenceContext
    private EntityManager em;

    public void insertMember(Member member)
    {
        em.persist(member);
    }

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    public List<Member> findName(String memberName,Academy academy) {
        return em.createQuery("select m from Member m where m.memberName = :member_name", Member.class)
                .setParameter("member_name", memberName,academy)
                .getResultList();
    }


}
