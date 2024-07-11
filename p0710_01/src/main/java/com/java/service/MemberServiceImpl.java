package com.java.service;

import com.java.dto.MemberDto;
import com.java.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public int loginCheck(String id, String pw, int pno) {

        System.out.println("service id : " +id);
        System.out.println("service pw : " +pw);
        System.out.println("service pno : " +pno);

        // mybatis 연결
        MemberDto mdto = memberMapper.selectLogin(id,pw);
        System.out.println("service name : "+mdto.getName());

        int check=0;
        if(id.equals("aaa") && pw.equals("1111")){
            System.out.println("로그인이 정상적으로 진행됩니다.");
            check=1;
        }else{
            System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
        }
        return check;
    }
}
