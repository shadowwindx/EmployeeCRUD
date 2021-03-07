package com.wind.crud.service;

import com.wind.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    //查詢全部的員工
    List<Employee> queryAllEmployee();
    //查詢員工透過Id
    Employee queryEmployeeById(int empId);
    //查詢員工透過姓名
    Employee queryEmployeeByName(String empName);
    //增加員工
    int addEmployee(Employee employee);
    //更新員工資料
    int updateEmployee(Employee employee);
    //刪除員工資料
    int deleteEmployee(int empId);
}
