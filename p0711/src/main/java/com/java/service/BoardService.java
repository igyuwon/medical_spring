package com.java.service;
import com.java.dto.BoardDto;
import java.util.ArrayList;

public interface BoardService {
    // 게시판리스트 가져오기
    ArrayList<BoardDto> selectList();
    // 게시글1개 가져오기
    BoardDto selectOne(BoardDto bdto);
    // 게시글 저장
    void insertBoard(BoardDto bdto);

    // 게시글 삭제
    void deleteBoard(BoardDto bdto);

    // 수정페이지
    BoardDto updateBoard(BoardDto bdto);

    // 수정한 글 저장
    void doUpdateBoard(BoardDto bdto);

    // 답글달기
    void insertReply(BoardDto bdto);
}
