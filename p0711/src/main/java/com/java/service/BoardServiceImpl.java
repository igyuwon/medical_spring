package com.java.service;

import com.java.dao.BoardDao;
import com.java.dto.BoardDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardDao boardDao;

    @Override
    public ArrayList<BoardDto> selectList() {

        // mybatis 연결해서 list 가져오기
        ArrayList<BoardDto> list = boardDao.selectList();
        return list;
    }

    @Override
    public BoardDto selectOne(BoardDto bdto) {
        boardDao.updateBhit(bdto); // 조회수 1 증가
        BoardDto boardDto = boardDao.selectOne(bdto);
        return boardDto;
    }

    @Override // 게시물 쓰기
    public void insertBoard(BoardDto bdto) {
        boardDao.insertBoard(bdto);

    }

    @Override // 게시물 삭제
    public void deleteBoard(BoardDto bdto) {
        boardDao.deleteBoard(bdto);
    }

    @Override // 게시물 수정
    public BoardDto updateBoard(BoardDto bdto) {
        BoardDto boardDto = boardDao.selectOne(bdto);

        return boardDto;
    }

    @Override // 게시글 수정저장
    public void doUpdateBoard(BoardDto bdto) {
        boardDao.updateBoard(bdto);
    } // modify_save

    @Override // 답글페이지 저장
    public void insertReply(BoardDto bdto) {
        boardDao.updateBstep(bdto); // 부모보다 큰 step 을 1씩 증가
        boardDao.insertReply(bdto);

    }
}
