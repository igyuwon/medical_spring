package com.java.mapper;

import com.java.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface BoardMapper {


    ArrayList<BoardDto> selectList();
}
