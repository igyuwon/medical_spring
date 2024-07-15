package com.java.service;

import com.java.dao.NoticeDao;
import com.java.dto.NoticeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired NoticeDao noticeDao;

    @Override
    public ArrayList<NoticeDto> selectAll() {
        ArrayList<NoticeDto> list = noticeDao.selectAll();
        return list;
    }
}
