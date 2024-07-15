package com.java.dao;

import com.java.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper // IOC 컨테이너 등록
public interface BoardDao {


    ArrayList<BoardDto> selectList();
}
