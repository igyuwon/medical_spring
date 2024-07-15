package com.java.service;


import com.java.dao.EDDao;
import com.java.dto.EDDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EDServiceImpl implements EDService {
    @Autowired EDDao edDao;

    @Override
    public ArrayList<EDDto> selectAll() {
        ArrayList<EDDto> list = edDao.selectAll();
        return list;
    }
}
