package com.example.demo.relation.domain.member;


import com.example.demo.relation.domain.academy.Academy;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor  // 방향성은 객체 상태 일때에만 존재한다.
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "login_id")
    private String loginId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "password")
    private String password;



    @JoinColumn(name ="academy name")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Academy academy;


    // public Member() {} // 기본 생성자가 있어야 복사생성자를 사용가능.(@NoArgsConstructor)
                                                        // 복사 생성자를 통해서 한번에 값을 바꾼다.

    public Member(Long id, String loginId, String memberName, String password, Academy academy) {
        this.id = id;
        this.loginId = loginId;
        this.memberName = memberName;
        this.password = password;
        this.academy = academy;
    }

    // new 인스턴스를 생성할때 호출된다.new Academy


}
