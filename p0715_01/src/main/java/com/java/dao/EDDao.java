package com.java.dao;

import com.java.dto.EDDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface EDDao {
    ArrayList<EDDto> selectAll();
}
