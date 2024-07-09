package com.java.controller;

import com.java.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {

    @RequestMapping("/index")
    public String index(){

        // 기본생성자
        Member m = new Member();

        // 전체생성자
        Member m2 = new Member("aaa","1111","홍길동","010-111-1111");

        // 부분생성자 파라미터 갯수가 다르면 여러개를 생성해야함. -> 그래서 @Builder를 사용함
        Member m3 = Member.builder().id("aaa").build();

        Member m4 = Member.builder().id("bbb").pw("1111").name("유관순").build();


        return "index";
    }
}
