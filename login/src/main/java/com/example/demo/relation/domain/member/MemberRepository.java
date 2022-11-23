package com.example.demo.relation.domain.member;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Member member)
    {
        em.persist(member);
    }

    public List<Member> findByName(String academyName) {
        return em.createQuery("select m from Member m join m.academy a where a.academyName =:name", Member.class)
                .setParameter("name",academyName)
                .getResultList();
    }

    public List<Member> findByLoginId(String loginId) {
        return em.createQuery("select m from Member m join m.academy a where a.academyName =:name", Member.class)
                .setParameter("login_id",loginId)
                .getResultList();
    }

    public List<Member> findByPassword(String password) {
        return em.createQuery("select m from Member m join m.academy a where a.academyName =:name", Member.class)
                .setParameter("password",password)
                .getResultList();
    }
}
