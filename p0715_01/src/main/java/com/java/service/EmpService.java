package com.java.service;

import com.java.dto.EmpDto;

import java.util.ArrayList;

public interface EmpService {

    // 사원리스트 모두 가져오기
    ArrayList<EmpDto> selectAll();
}
