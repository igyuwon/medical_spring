package com.java.sevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dao.NoticeDao;
import com.java.dto.CommentBDto;
import com.java.dto.NoticeDto;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired NoticeDao noticeDao;
	
	@Override  //게시글 리스트
	public ArrayList<NoticeDto> selectAll() {

		ArrayList<NoticeDto> list = noticeDao.selectAll(); 
		return list;
	}

	@Override
	public Map<String, Object> selectOne(NoticeDto noticeDto) {

		Map<String, Object> map = new HashMap<>();
		
		// 조회수 1증가
		noticeDao.updateBhit(noticeDto);
		//게시글 1개 가져오기
		NoticeDto nDto = noticeDao.selectOne(noticeDto);
		//이후 페이지 추가 이전글 다음글
		
		//게시글 하단댓글 모두 가져오기 - 클릭하는 게시글의 댓글
		ArrayList<CommentBDto> list = noticeDao.selectAllCommentB(noticeDto);
		//댓글 개수 세기
		int countComment = noticeDao.countAllCommentB(noticeDto);
		
		map.put("nDto", nDto);
		map.put("list", list);
		map.put("countComment", countComment);
		
		return map;
	}

	@Override // 하딘
	public CommentBDto insertCommentB(CommentBDto commentBDto) {
		System.out.println("service cno"+commentBDto.getCno());
		// 하단댓글 저장
		noticeDao.insertCommentB(commentBDto);
		// cno 생성 후 출력
		System.out.println("service cno2"+commentBDto.getCno());
		// 하단댓글 1개 가져오기 selectkey
		CommentBDto cBDto = noticeDao.selectOneCommentB(commentBDto);
		return cBDto;
	}

	@Override // 하단댓글 삭제
	public void deleteCommentB(CommentBDto commentBDto) {
		System.out.println("service cno"+commentBDto.getCno());
		// 하단댓글 저장
		noticeDao.deleteCommentB(commentBDto);
		return;

	}

	@Override // 하단댓글 수정
	public CommentBDto updateCommentB(CommentBDto commentBDto) {
		System.out.println("service cno"+commentBDto.getCno());
		// 하단댓글 수정저장
		noticeDao.updateCommentB(commentBDto);
		// 하단댓글 1개 가져오기
		CommentBDto cBDto = noticeDao.selectOneCommentB(commentBDto);
		return cBDto;
	}


}
