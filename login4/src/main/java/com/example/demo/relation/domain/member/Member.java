package com.example.demo.relation.domain.member;


import com.example.demo.relation.domain.academy.Academy;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@SecondaryTables({                              // address 의 테이블을 만든다.
        @SecondaryTable(name ="member_address",pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))  // 연결시킨다.
})
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

    @AttributeOverrides({           // 변수명  (이변수명을 이컬럼으로 설정한다.  // table 과  Colum 설정 하는것.
            @AttributeOverride(name = "country",column = @Column(table = "member_address",name = "address1")),
            @AttributeOverride(name = "city",column = @Column(table = "member_address",name = "address2")),
            @AttributeOverride(name = "address1",column = @Column(table = "member_address",name = "address1")),
            @AttributeOverride(name = "address2",column = @Column(table = "member_address",name = "address2")),
            @AttributeOverride(name = "zipcode",column = @Column(table = "member_address",name = "zipcode"))
    })

    private Address address;

    @JoinColumn(name = "academy_id")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Academy academy;

    // public Member() {} // 기본 생성자가 있어야 복사생성자를 사용가능.(@NoArgsConstructor)
                                                        // 복사 생성자를 통해서 한번에 값을 바꾼다.

    public Member(String loginId, String memberName, String password, Academy academy) {
        this.loginId = loginId;
        this.memberName = memberName;
        this.password = password;
        this.academy = academy;

        address.setAddress1("");
        address.setAddress2("");
        address.setZipcode("");


    }

    // new 인스턴스를 생성할때 호출된다.new Academy


}
