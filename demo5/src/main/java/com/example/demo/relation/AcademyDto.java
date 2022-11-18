package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class AcademyDto {

    @NonNull
    private  String academyName;

    public MemberDto(String academyName)
    {
        this.academyName = academyName;
    }

}