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
public class DepartDto {
    private int department_id;
    private String department_name;
    private int parent_id;
    private int manager_id;
    private Timestamp create_date;
    private Timestamp update_date;

}
