package com.example.demo.relation.domain.member;




import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor  // 기본 생성자.
@Embeddable
public class Address {

    @Column(table = "member_address")
    private String country;

    @Column(table = "member_address")
    private String city;

    @Column(table = "member_address")
    private String address1;

    @Column(table = "member_address")
    private String address2;

    @Column(table = "member_address")
    private String zipcode;

    // 복사 생성자.
    public Address(String country, String city, String address1, String address2, String zipcode) {
        this.country = country;
        this.city = city;
        this.address1 = address1;
        this.address2 = address2;
        this.zipcode = zipcode;
    }
}
