package com.example.demo.relation.view.login.dto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginDto {

    @NotEmpty
    private String loginId;

    private String password;
}
