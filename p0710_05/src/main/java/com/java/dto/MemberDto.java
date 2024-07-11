package com.java.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemberDto {
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String gender;
    private String hobby;
    private Timestamp mdate;

}
