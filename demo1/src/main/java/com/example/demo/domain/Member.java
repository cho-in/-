package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

// @Getter @Setter // lombok
// @NoArgsConstructor  // 기본 생성자를 자동생성한다.
@Entity // 엔티티는 멤버 bean
@Table(name = "Member")
public class Member {

    @Id @GeneratedValue  // key 를 자동생성한다.
    private Long id;

    @Column(name = "NAME")
    private String userName;
}
