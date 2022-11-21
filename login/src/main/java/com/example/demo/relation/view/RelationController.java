package com.example.demo.relation.view;


import com.example.demo.relation.service.OrderService;
import com.example.demo.relation.view.member.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;


@RequestMapping("/members")  // relation 컨트롤러를 사용하기위해서는 "/member" 를 거쳐가야한다.
@RequiredArgsConstructor   // final 생성자를 써준다.
@Controller
public class RelationController {


    private final OrderService orderService;


   // @Transactional()
    @GetMapping("/new")
    public String insert(@ModelAttribute("form") MemberDto dto) // dto 가 멤버를 만들어준다. 필드값이 다수일 경우 하나로 초기화하는 복사생성자여야 한다.
    {                                                           // dto 를 "form" 이라고 부른다는 것이다.
        return "members/newMemberForm";   // 템블릿에 있는 members 이다.
    }

    @PostMapping("/new")
    public String save(@Valid @ModelAttribute("form") MemberDto dto) // dto 가 멤버를 만들어준다. 필드값이 다수일 경우 하나로 초기화하는 복사생성자여야 한다.
    {                                                           // dto 를 "form" 이라고 부른다는 것이다.
        orderService.insert(
                new Member(dto.getMemberName()));
        return "redirect:/";
    }

}
