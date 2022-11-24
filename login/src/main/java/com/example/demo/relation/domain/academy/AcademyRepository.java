package com.example.demo.relation.domain.academy;

import com.example.demo.relation.domain.member.Member;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AcademyRepository {

    @PersistenceContext
    private EntityManager em;

    public Academy findById(Long id){
        return em.find(Academy.class, id);
    }

    public List<Academy> findAll()
    {
        return em.createQuery("select a from Academy a").getResultList();
    }

    public List<Academy> findByName(String academyName) {   // 필수 쿼리문.
        return em.createQuery("select m from Member m join m.academy a where a.academyName =:name", Member.class)
                .setParameter("name",academyName)
                .getResultList();
    }

    /* public List<Academy> findByName(String academyName) {
        return em.createQuery("select a from Member a where m.academy.name = name", Academy.class)
                .setParameter("name",academyName)
                .getResultList();
    }*/
}
