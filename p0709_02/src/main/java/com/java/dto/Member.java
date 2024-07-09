package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String gender;
    private String hobby;
    private String[] hobbys;

    // 객체로 받기 위해서 : 기본 생성자, 객체생성자, getter/setter 필요

}
