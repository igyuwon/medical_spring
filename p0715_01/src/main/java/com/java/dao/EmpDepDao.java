package com.java.dao;

import com.java.dto.EmpDepDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@Mapper
public interface EmpDepDao {
    ArrayList<EmpDepDto> selectAll();

}
