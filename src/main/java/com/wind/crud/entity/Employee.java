package com.wind.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private String empAddress;
    private Date empBirthday;
    private Integer empSalary;
    private String empGender;
}
