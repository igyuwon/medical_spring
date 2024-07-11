package com.java.mapper;

import com.java.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

// DAO
@Mapper // IOC 주입
public interface MemberMapper {
    // 로그인 체크
    MemberDto selectLogin(String id, String pw);
}
