package com.example.demo.domain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller   // 컨트롤러로 지정.
public class DemoController {

    @GetMapping("hello") // 요청이 들어오면 헬로우라는 링크를 맵핑한다.이름을 맞춰주는게 좋다.
    public String hello(Model model)
    {
        Member member = new Member();
        member.setUsername("홍길동");   // 홍길동 값을 갖고 나옴.

        model.addAttribute("data", member.getUsername());   // 속성값을 전달해준다.

        return "hello";
        // ${} 데이터값을 넣는것. // <a href="/hello">Hello Page</a> 링크를 보내는법 onclick 넘기는것.
    }

}
