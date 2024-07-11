package com.java.mapper;

import com.java.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    MemberDto selectLogin(MemberDto mdto);
}
