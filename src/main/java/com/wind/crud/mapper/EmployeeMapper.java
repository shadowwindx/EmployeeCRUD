package com.wind.crud.mapper;

import com.wind.crud.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {

    //查詢全部的員工
    List<Employee> queryAllEmployee();
    //查詢員工透過Id
    Employee queryEmployeeById(@Param("empId") int empId);
    //查詢員工透過姓名
    Employee queryEmployeeByName(@Param("empName") String empName);
    //增加員工
    int addEmployee(Employee employee);
    //更新員工資料
    int updateEmployee(Employee employee);
    //刪除員工資料
    int deleteEmployee(@Param("empId") int empId);
}
