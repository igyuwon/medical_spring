package com.java.service;

import com.java.dao.DepartDao;
import com.java.dto.DepartDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartDao departDao;

    @Override // 사원리스트 모두 가져오기
    public ArrayList<DepartDto> selectAll() {
        ArrayList<DepartDto> list = departDao.selectAll();
        return list;
    }
}

