package com.wind.crud.controller;

import com.wind.crud.entity.Employee;
import com.wind.crud.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

    //查詢全部的員工
    @GetMapping("/findAll")
    public String list(Model model) {
        List<Employee> employeeList = employeeService.queryAllEmployee();
        model.addAttribute("employeeList", employeeList);
        return "emp/empList";
    }

    //增加員工
    @GetMapping( "/emp")
    public String toAddPage() {
        return "emp/empAdd";
    }

    //增加員工
    @PostMapping( "/emp")
    public String addEmp(Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/findAll";
    }

    //更新員工資料(先查id)
    @GetMapping( "/emp/{empId}")
    public String updateEmp(@PathVariable int empId, Model model) {
        //查出原來的資料
        Employee employeeById = employeeService.queryEmployeeById(empId);
        model.addAttribute("empById", employeeById);
        return "emp/empUpdate";
    }

    //更新員工資料(修改資料)
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee) {
        employeeService.updateEmployee(employee);
        return "redirect:/findAll";
    }

    //刪除員工資料
    @GetMapping("deleteById/{empId}")
    public String deleteEmp(@PathVariable("empId") int empId) {
        employeeService.deleteEmployee(empId);
        return "redirect:/findAll";
    }


    //查詢員工透過姓名
    @GetMapping("/queryEmp")
    public String queryEmp(String queryEmp, Model model) {

        if (queryEmp.length() == 0 || queryEmp.trim().length() == 0) {
            model.addAttribute("employeeList",employeeService.queryAllEmployee());
            model.addAttribute("notFindEmp", "請輸入員工姓名");
            return "emp/empList";
        }

        Employee employee = employeeService.queryEmployeeByName(queryEmp);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        if (employee == null) {
            employeeList = employeeService.queryAllEmployee();
            model.addAttribute("notFindEmp", "找不到這名員工");
        }
        model.addAttribute("employeeList", employeeList);

        return "emp/empList";
    }


}
