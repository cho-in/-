package com.example.demo.relation;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor  // 방향성은 객체 상태 일때에만 존재한다.
@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;


    @Column(name = "member_name")
    private String memberName;

    @JoinColumn
    @ManyToOne
    private Academy academy;

    public Member(String memberName, Academy academy)
    {
        this.memberName = memberName;
        this.academy = academy;
    }
}
