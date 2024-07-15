package com.java.dao;

import com.java.dto.DepartDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface DepartDao {

    ArrayList<DepartDto> selectAll();
}
