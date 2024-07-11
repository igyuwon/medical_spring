package com.java.service;


import com.java.dto.BoardDto;

import java.util.ArrayList;

public interface BoardService {

    ArrayList<BoardDto> selectList();
}
