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
public class EmpDto {
    private int employee_id, manager_id, department_id;
    private double salary, commission_pct;
    private String emp_name, email, phone_number, job_id;
    private Timestamp hire_date, retire_date, create_date, update_date;

}
