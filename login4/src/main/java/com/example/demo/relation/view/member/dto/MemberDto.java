package com.example.demo.relation.view.member.dto;


import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;


@Data  // Getter Setter 를 대체한다.
public class MemberDto {


    //@NonNull  // 공백 넣을수가 있다.
    @NotEmpty(message ="필수 항목 입니다.")   // 비어있는 상태로 받을수가 없다.
    private String loginId;

    @NotEmpty(message = "필수 항목 입니다.")
    private String userEmail;

    @NotEmpty(message = "필수 항목 입니다.")
    private String password;

    @NotEmpty(message = "필수 항목 입니다.")
    private String passwordConfirm;

    @NotEmpty(message = "필수 항목 입니다.")
    private String memberName;

    @NotEmpty(message = "필수 항목 입니다.")
    private String academyName;

    @Column(table =  "필수 항목 입니다.")
    private String country;

    @Column(table =  "필수 항목 입니다.")
    private String city;

    @Column(table =  "필수 항목 입니다.")
    private String address1;

    @Column(table =  "필수 항목 입니다.")
    private String address2;

    @Column(table = "필수 항목 입니다.")
    private String zipcode;
}
