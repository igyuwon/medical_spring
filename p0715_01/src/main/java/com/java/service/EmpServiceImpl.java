package com.java.service;

import com.java.dao.EmpDao;
import com.java.dto.EmpDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    EmpDao empDao;

    @Override // 사원리스트 모두 가져오기
    public ArrayList<EmpDto> selectAll() {
        ArrayList<EmpDto> list = empDao.selectAll();
        return list;
    }
}
