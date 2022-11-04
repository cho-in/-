package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter   //
@NoArgsConstructor // 기본 생성자를 만들어준다.
@Entity  // 테이블을 create 한다.
@Table(name = "Member") // 테이블의 이름을 Member 로 한다.
public class Member {


    @Id @GeneratedValue   // 자동으로 키를 넣는 코드.
    private Long id;

    @Column(name = "NAME")
    private String username;
    public Member(String username)
    {
        this.username = username;
    }


    /*
    @Column(name = "AGE")
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

// ** [영속성]

// ** 영속 : EntityManager 에 포함된 상태
// ** 비 영속 : EntityManager 에 포함되기 전 상태
// ** 준 영속 :  EntityManager 에 포함되었었고 , 현재는 포함되지 않은 상태
// ** 삭제 : 삭제된 상태.

