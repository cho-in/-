package com.example.demo.relation.domain.academy;


import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Academy {


    @Id @GeneratedValue
    private Long id;

    @Column(name = "academy_name")
    private String academyName;

  /*   @Column(name = "login_id")
    private String loginId;

    @Column(name = "password")
    private String password;

     @OneToMany(mappedBy = "academy")   //
    private List<Member> members = new ArrayList<>();


    public void addMember(Member member)
    {
        members.add(member);
    }*/

    public Academy(String academyName) {
        this.academyName = academyName;
    }

}
