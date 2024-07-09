package com.java.controller;

import com.java.dto.Students;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("/students")
public class StuController {

    @RequestMapping("/students")
    public String students(){
        return "students/students";
    }

    // doStudents.jsp 데이터를 보여지도록 하시오.
    @RequestMapping("/doStudents")
    public ModelAndView doStudents(Students stu){
        stu.setTotal(stu.getKor()+stu.getEng()+stu.getMath());
        stu.setAvg(stu.getTotal()/3.0);
        stu.setHobby(Arrays.toString(stu.getHobbys()));

//        Students s = new Students(stu.getStuNo(),stu.getName(),stu.getKor(),stu.getEng(),stu.getMath());

        ModelAndView modelAndView = new ModelAndView();

        ModelAndView mv = new ModelAndView();
        mv.addObject("stu", stu);
        mv.setViewName("students/doStudents");

        return mv;
    }

    @RequestMapping("/stuUpdate")
    public ModelAndView stuUpdate(Students stu) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("stu", stu);
        mv.setViewName("students/stuUpdate");
        return mv;
    }



}
