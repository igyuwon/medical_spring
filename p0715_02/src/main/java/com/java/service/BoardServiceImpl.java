package com.java.service;

import com.java.dao.BoardDao;
import com.java.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired BoardDao boardDao;
    @Override
    public ArrayList<BoardDto> selectAll(String category, String sword) {
        ArrayList<BoardDto> list = boardDao.selectAll(category,sword);
        return list;
    }
}
