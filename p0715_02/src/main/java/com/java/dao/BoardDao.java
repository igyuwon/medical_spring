package com.java.dao;

import com.java.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BoardDao {
    ArrayList<BoardDto> selectAll(String category, String sword);
}
