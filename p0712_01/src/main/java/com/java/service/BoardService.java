package com.java.service;

import com.java.dto.BoardDto;

import java.util.ArrayList;

public interface BoardService {
    void Selectcount();

    // 게시판 전체 가져오기
    ArrayList<BoardDto> selectList();
}
