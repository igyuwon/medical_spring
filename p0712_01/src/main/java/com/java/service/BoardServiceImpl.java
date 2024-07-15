package com.java.service;

import com.java.dao.BoardDao;
import com.java.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service // IOC 컨테이너 등록
@Qualifier(value="ver1")
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardDao boardDao;

    // 버전 1
    @Override
    public void Selectcount() {
        System.out.println("BoardServiceImpl 버전1111이 실행됩니다.");

    }

    @Override
    public ArrayList<BoardDto> selectList() {
        ArrayList<BoardDto> list = boardDao.selectList();
        System.out.println("service list : "+list.size());

        return list;
    }


}
