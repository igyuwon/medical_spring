package com.java.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.java.dto.CommentBDto;
import com.java.dto.NoticeDto;

@Mapper
public interface NoticeDao {

	//게시글 리스트 가져오기
	ArrayList<NoticeDto> selectAll();

	//게시글 1개 가져오기
	NoticeDto selectOne(NoticeDto noticeDto);
	//조회수 1증가
	void updateBhit(NoticeDto noticeDto);
	// 해당 게시글 댓글 보여지기
	ArrayList<CommentBDto> selectAllCommentB(NoticeDto noticeDto);
	//댓글 개수
	int countAllCommentB(NoticeDto noticeDto);
	// 하단댓글 저장
	void insertCommentB(CommentBDto commentBDto);
	// 하단댓글 1개 가져오기
	CommentBDto selectOneCommentB(CommentBDto commentBDto);
	// 하단댓글 삭제
	void deleteCommentB(CommentBDto commentBDto);
	// 하단댓글 수정
	void updateCommentB(CommentBDto commentBDto);
}
