package com.example.demo.repository;  // 저장소는 db와 매칭되어있다.


import com.example.demo.domain.Member;   // db 에 가장 가까우므로 핵심수행만 한다.
import com.example.demo.dto.MemberDto;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository  // 이 클래스를 MemberRepository 지정한다. (지정해야 @Autowired 가능)
public class MemberRepository  {

    public Object insertMember;
    @PersistenceContext
    private EntityManager em;   // 영속성 상태.

    public void insertMember(Member member)
    {
        em.persist(member);
    }

    public List<Member> findAll() {
       return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
    public List<Member> findName(String username) {
        return em.createQuery("select m from Member m where m.username = :name", Member.class)
                .setParameter("name", username)   // create query 편의성 함수.
                .getResultList();
    }
    public void deleteMember(String username) {
        List<Member> members = findName(username);
        for(int i =0 ; i< members.size() ; ++i ){
            em.remove(members.get(i));
        }
    }

}
