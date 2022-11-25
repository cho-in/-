package com.example.demo.relation.view.member;

import com.example.demo.relation.domain.academy.Academy;
import com.example.demo.relation.domain.academy.AcademyRepository;
import com.example.demo.relation.domain.member.Member;
import com.example.demo.relation.domain.service.MemberService;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.management.relation.RelationService;
import javax.validation.Valid;
import java.util.List;


@RequestMapping("/members")  // relation 컨트롤러를 사용하기위해서는 "/member" 를 거쳐가야한다.
@RequiredArgsConstructor   // final 생성자를 써준다.
@Controller
public class RelationController {

    private final RelationService relationService;

    private final AcademyRepository academyRepository;


    // @Transactional()
    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) // dto 가 멤버를 만들어준다. 필드값이 다수일 경우 하나로 초기화하는 복사생성자여야 한다.
    {                                                           // dto 를 "form" 이라고 부른다는 것이다.
        return "members/newMemberForm";   // 템블릿에 있는 members 이다.
    }

    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto,BindingResult bindingResult) // dto 가 멤버를 만들어준다. 필드값이 다수일 경우 하나로 초기화하는 복사생성자여야 한다.
    {                                                           // dto 를 "form" 이라고 부른다는 것이다.
        if(bindingResult.hasErrors())
            return "member/newMemberform";

        List<Member> academies =academyRepository.findByName(dto.getAcademyName());

        Academy academy = null;

        if(!academise.isEmpty())
            academy = academise.get(0);
        else
            academy= new Academy(dto.getAcademyName());

        List<Member> members =relationService.findByLoginId(dto.getAcademyName());

        /*// boolean check = true;       ======   List<Member> members =memberService.findByName(dto.getAcademyName());

        // List<Academy> all 아무것도 없음.*/

        if (!members.isEmpty())
        {
            System.out.println("Error Message !!!");
            return "members/newMemberForm";
        }
        else
            relationService.insert(
                    new Member(
                            dto.getLoginId(),
                            dto.getMemberName(),
                            dto.getPassword(),
                            academy) );
        }

    }

}
