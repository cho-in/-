package com.example.demo.relation.view.login;

import com.example.demo.relation.domain.login.LoginService;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@RequiredArgsConstructor
@Controller
public class LoginController {

   private final LoginService loginService;

    @GetMapping("/login")
    public String login(@Valid @ModelAttribute("form")MemberDto dto)
    {
        return "login/loginForm";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("form")MemberDto dto,BindingResult bindingResult)
    {
        loginService.login(dto.getLoginId());
    }
}
