package com.wind.crud.service;

import com.wind.crud.entity.Employee;
import com.wind.crud.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryAllEmployee() {
        return employeeMapper.queryAllEmployee();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Employee queryEmployeeById(int empId) {
        return employeeMapper.queryEmployeeById(empId);
    }

    @Override
    public Employee queryEmployeeByName(String empName) {
        return employeeMapper.queryEmployeeByName(empName);
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public int deleteEmployee(int empId) {
        return employeeMapper.deleteEmployee(empId);
    }
}
