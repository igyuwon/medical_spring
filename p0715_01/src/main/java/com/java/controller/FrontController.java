package com.java.controller;

import com.java.dto.DepartDto;
import com.java.dto.EDDto;
import com.java.dto.EmpDepDto;
import com.java.dto.EmpDto;
import com.java.service.DepartService;
import com.java.service.EDService;
import com.java.service.EmpDepService;
import com.java.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class FrontController {

    @Autowired EmpService empService;
    @Autowired DepartService departService;
    @Autowired EmpDepService empDepService; // 컬럼변수사용
    @Autowired EDService edService; // 컬럼 전체객체사용

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/emp_list")
    public ModelAndView emp_list(){
        // 사원테이블 모두 가져오기
        ArrayList<EmpDto> list = empService.selectAll();

        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("emp_list");

        return mv;
    }

    @RequestMapping("/depart_list")
    public ModelAndView depart_list(){
        // departments 모두 가져오기
        ArrayList<DepartDto> list = departService.selectAll();

        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("depart_list");

        return mv;
    }
    @RequestMapping("/empDep_list") // 사원+부서테이블 조인 가져오기
    public ModelAndView empDep_list(){
        // departments 모두 가져오기
        ArrayList<EmpDepDto> list = empDepService.selectAll();

        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("empDep_list");

        return mv;
    }
    @RequestMapping("/ed_list") // 사원+부서테이블 조인 가져오기
    public ModelAndView ed_list(){
        // departments 모두 가져오기
        ArrayList<EDDto> list = edService.selectAll();

        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);
        mv.setViewName("ed_list");

        return mv;
    }
}
