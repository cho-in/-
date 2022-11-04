package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class MemberDto {

    @NonNull
    private  String username;

    public MemberDto(String username)
    {
        this.username = username;
    }

}
