package com.java.dao;

import com.java.dto.NoticeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface NoticeDao {
    ArrayList<NoticeDto> selectAll();
}
