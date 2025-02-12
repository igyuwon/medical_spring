package com.java.sevice;

import java.util.ArrayList;
import java.util.Map;

import com.java.dto.CommentBDto;
import com.java.dto.NoticeDto;

public interface NoticeService {

	ArrayList<NoticeDto> selectAll();

	Map<String, Object> selectOne(NoticeDto ndto);

	// 하단댓글저장, 1개 가져오기
	CommentBDto insertCommentB(CommentBDto commentBDto);

	// 하단댓글 삭제
	void deleteCommentB(CommentBDto commentBDto);

	// 하단댓글 수정
	CommentBDto updateCommentB(CommentBDto commentBDto);
}
