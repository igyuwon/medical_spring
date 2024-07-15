package com.java.service;

import com.java.dto.BoardDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Qualifier(value="ver2")
public class BoardServiceImplVer2 implements BoardService {

    // 버전2. 새로운 버전의 서비스를 1개 더 만듬
    @Override
    public void Selectcount() {
        System.out.println("BoardServiceImpl 버전22222이 실행됩니다.");

    }

    @Override
    public ArrayList<BoardDto> selectList() {

        return null;
    }
}
