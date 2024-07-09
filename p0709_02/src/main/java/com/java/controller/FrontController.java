package com.java.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

//@RestController // index를 그냥 데이터로 생각하여 index라는 글자를 리턴함
@Controller // index를 index.jsp로 리턴함
public class FrontController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/boardList")
	public String boardList(@RequestParam(defaultValue = "1")int bno, Model model) {
		System.out.println("bno : "+bno);
		model.addAttribute("bno", bno);
		return "boardList";
	}
	@RequestMapping("/boardList2/{bno}")
	public String boardList2(@PathVariable int bno, Model model) {
		System.out.println("bno : "+bno);
		model.addAttribute("bno", bno);
		return "boardList2";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping("/doForm")
	public ModelAndView doForm(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String[] hobby = request.getParameterValues("hobby");
		mv.addObject("id",request.getParameter("id"));
		mv.addObject("pw",request.getParameter("pw"));
		mv.addObject("name",request.getParameter("name"));
		mv.addObject("phone",request.getParameter("phone"));
		mv.addObject("gender",request.getParameter("gender"));
		mv.addObject("hobby",Arrays.toString(hobby));
		mv.setViewName("doForm");
		return mv;
	}
	
	
	
	
}
