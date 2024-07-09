package com.java.controller;

import java.util.Arrays;

import com.java.dto.Member;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
public class MemberController {
	@RequestMapping("/member") // 주소에 이 요청이 들어오면(get post 둘 다 가능)
	public String member(){
		return "member/member"; // member의 페이지를 열어줘라
	}

	@RequestMapping("/doMember")
	// 객체로 받을거임
	public ModelAndView doMember(Member member){
		System.out.println("id : "+member.getId());
		System.out.println("name : "+member.getName());
		System.out.println("gender : "+member.getGender());

		System.out.println("hobby : "+Arrays.toString(member.getHobbys()));
		member.setHobby(Arrays.toString(member.getHobbys()));
		ModelAndView mv = new ModelAndView();
		mv.addObject("member", member);
		mv.setViewName("member/doMember");

		return mv;
	}

	@RequestMapping("/login")
	public String login() {
		return "member/login";
	}

	@RequestMapping("/member/doLogin")
	public ModelAndView doLogin(@RequestParam("id") String id, String pw,
								@RequestParam(defaultValue="1") int pno) {
		System.out.println(id);
		System.out.println(pw);
		System.out.println(pno);

		ModelAndView mv = new ModelAndView();
		mv.addObject("id",id);
		mv.addObject("pw",pw);
		mv.addObject("pno",pno);

		mv.setViewName("member/doLogin");

		return mv;
	}

	@RequestMapping("/data")
	public String data() {
		return "member/data";
	}

	// requestparam 형태로 doData에 전송

	@RequestMapping("/doData")
//	public ModelAndView doData(@RequestParam String stuNo, String name, String kor, String[] hobby) {
	// 입력했는지 안했는지 판단 : defaultValue
	public ModelAndView doData(@RequestParam(defaultValue = "1") String stuNo, String name,
							   @RequestParam(defaultValue = "0")String kor,
							   String[] hobby) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("stuNo",stuNo);
		mv.addObject("name",name);
		mv.addObject("kor",kor);
		mv.addObject("hobby",Arrays.toString(hobby));

		return mv;

	}


}
