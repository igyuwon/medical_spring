package com.java.controller;

import com.java.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {

    @Autowired
    MemberService memberService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/member/login") // 로그인화면
    public String login() {

        return "member/login";
    }
    @RequestMapping("/member/doLogin")
    public ModelAndView doLogin(String id, String pw, int pno) {
        System.out.println("id : "+id);
        System.out.println("pw : "+pw);
        System.out.println("pno : "+pno);


        // check를 출력하시오.
        int check =  memberService.loginCheck(id,pw,pno);
        System.out.println("로그인 확인여부 : "+check);

        ModelAndView mv = new ModelAndView();
        mv.addObject("id", id);
        mv.addObject("pw", pw);
        mv.addObject("pno", pno);
        mv.addObject("check", check);

        mv.setViewName("member/doLogin");

        return mv;
    }
}
