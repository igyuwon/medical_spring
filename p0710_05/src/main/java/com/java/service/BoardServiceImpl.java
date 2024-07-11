package com.java.service;

import com.java.dto.BoardDto;
import com.java.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper boardMapper;


    @Override
    public ArrayList<BoardDto> selectList() {
        ArrayList<BoardDto> list = boardMapper.selectList();

        System.out.println("serviceImpl list : "+list.size());
        return list;
    }
}
