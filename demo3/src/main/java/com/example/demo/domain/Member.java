package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter  //
@NoArgsConstructor // 기본 생성자를 만들어준다.
@Entity  // 테이블을 create 한다.
@Table(name = "Member") // 테이블의 이름을 Member 로 한다.
public class Member {

    @Id
    @GeneratedValue   // 자동으로 키를 넣는 코드.
    private Long id;

    @Column(name = "NAME")
    private String userName;

    @Column(name = "NAME")
    private Integer age;
    @Column(name = "EMAIL")
    private String email;

   public Member(String userName,Integer age, String email)
   {
       this.userName = userName;
       this.email = email;
       this.age = age;
   }
    /* public Member(String userName, int age, String email)  // 복사 생성자.
    {
        this.userName = userName;
        this.age = age;
        this.email = email;
    }
    */
}
