package com.java.dao;

import com.java.dto.EmpDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface EmpDao {

    ArrayList<EmpDto> selectAll();
}
