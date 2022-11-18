package com.example.demo.relation.view;


import com.example.demo.relation.domain.Academy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {

    private String memberName;

    private Academy academy;

}
