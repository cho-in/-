package com.example.demo.relation.view.member.dto;

import com.example.demo.relation.academy.Academy;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.NotEmpty;


@Data  // Getter Setter 를 대체한다.
public class MemberDto {


    //@NonNull  // 공백 넣을수가 있다.
    @NotEmpty   // 비어있는 상태로 받을수가 없다.
    private String loginId;


    @NotEmpty
    private String password;


    @NotEmpty
    private String memberName;

}
