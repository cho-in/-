package com.example.demo.relation;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class AcademyRepository {
    public Object insertAcademy;
    private EntityManager em;

    public void insertMember(Academy academy)
    {
        em.persist(academy);
    }

    public List<Academy> findAll() {
        return em.createQuery("select a from Academy a", Academy.class)
                .getResultList();
    }
    public ArrayList<Academy> (String academyName) {
        return em.createQuery("select a from Academy a where a.academyName = :academy_name", Academy.class)
                .setParameter("academy_name", academyName,academy)
                .getResultList();
    }

}
