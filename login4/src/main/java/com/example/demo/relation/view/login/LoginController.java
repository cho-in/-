package com.example.demo.relation.view.login;

import com.example.demo.relation.domain.login.LoginService;
import com.example.demo.relation.domain.member.Address;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.view.login.dto.LoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class LoginController {
    @PersistenceContext
    private EntityManager em;
    private final LoginService loginService;

    @GetMapping("/login")
    public String login(@ModelAttribute("form") LoginDto dto)
    {
        return "login/loginForm";
    }


    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("form") LoginDto dto, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
            return "login/loginForm";

        List<Member> members = loginService.login(
                dto.getLoginId(), dto.getPassword());
        if(members.size() == 0)
        {
            bindingResult.reject("loginFail", "존재하지 않는 사용자 입니다.");
            return "login/loginForm";
        }
        else {
            for (Member member : members) {
                if (member.getPassword().equals(dto.getPassword()))
                {
                    member.getAddress().getAddress1();
                    member.getAddress().getAddress2();
                    member.getAddress().getZipcode();
                    return "login/join";
                }
                else{
                    bindingResult.reject("loginFail", "비밀번호를 다시 확인하세요.");
                    return "login/loginForm";
                }



            }
        }

        return "redirect:/";
    }

    @Transactional
    @GetMapping("main")
    public void insert()
    {
        //Address address1 = new Address("");
        //Address address2 = new Address("");
        //Address address3 = new Address("");

        //Member member1 = new Member();

        //address1.addMember(member1);

        //em.persist(member1);
        //em.persist(address1);
        //em.persist(address2);
        //em.persist(address3);
    }
}
