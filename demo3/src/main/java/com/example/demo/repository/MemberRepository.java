package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // 이 클래스를 MemberRepository 지정한다. (지정해야 @Autowired 가능)
public interface MemberRepository extends JpaRepository<Member, Long> {
}
