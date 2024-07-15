package com.java.service;

import com.java.dto.NoticeDto;

import java.util.ArrayList;

public interface NoticeService {
    ArrayList<NoticeDto> selectAll();
}
