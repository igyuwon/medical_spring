package com.java.dao;

import com.java.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
    // 로그인 확인
    MemberDto selectLogin(MemberDto memberDto);
}
