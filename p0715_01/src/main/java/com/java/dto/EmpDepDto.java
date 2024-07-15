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
public class EmpDepDto {


    private int employee_id, department_id;
    private double salary;
    private String emp_name;
    private Timestamp hire_date;
    private String department_name;
    private int parent_id;
}
