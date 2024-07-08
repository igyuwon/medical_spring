package com.java.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class FrontController {
    @RequestMapping(value="/index",method= RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/member") // 회원가입 폼
    public String member(){
        return "member";
    }

    @RequestMapping("/doMember") // 회원가입
    public ModelAndView doMember(HttpServletRequest request){
        String[] hobby = request.getParameterValues("hobby");
        String hobbys = ""; // game,golf,run,swim,bool -> 배열로 저장하고 싶으면 split
        for(int i=0;i<hobby.length;i++){
            if(i == 0) hobbys += ""+hobby[i];
            else hobbys += ","+hobby[i];

        }
        System.out.println("id:"+request.getParameter("id"));
        System.out.println("pw:"+request.getParameter("pw"));
        System.out.println("name:"+request.getParameter("name"));
        System.out.println("phone:"+request.getParameter("phone"));
        System.out.println("gender:"+request.getParameter("gender"));
//        System.out.println("hobby:"+Arrays.toString(hobby));
        System.out.println("hobbys : "+hobbys);

        ModelAndView mv = new ModelAndView();

        mv.addObject("id",request.getParameter("id"));
        mv.addObject("pw",request.getParameter("pw"));
        mv.addObject("name",request.getParameter("name"));
        mv.addObject("phone",request.getParameter("phone"));
        mv.addObject("gender",request.getParameter("gender"));
//        mv.addObject("hobby",Arrays.toString(hobby));
        mv.addObject("hobby",hobbys);
        mv.setViewName("doMember"); // 파일이름

        return mv;
    }

    @RequestMapping("/memUpdate") // 회원정보수정
    public ModelAndView memUpdate(HttpServletRequest request){
        String[] hobby = request.getParameterValues("hobby");
        String hobbys = ""; // game,golf,run,swim,bool -> 배열로 저장하고 싶으면 split
        for(int i=0;i<hobby.length;i++){
            if(i == 0) hobbys += ""+hobby[i];
            else hobbys += ","+hobby[i];

        }
        System.out.println("hobbys : "+hobbys);

        ModelAndView mv = new ModelAndView();

        mv.addObject("id",request.getParameter("id"));
        mv.addObject("pw",request.getParameter("pw"));
        mv.addObject("name",request.getParameter("name"));
        mv.addObject("phone",request.getParameter("phone"));
        mv.addObject("gender",request.getParameter("gender"));
        mv.addObject("hobby",hobbys);
        return mv;
    }
}
