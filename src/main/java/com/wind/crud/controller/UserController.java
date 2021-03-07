package com.wind.crud.controller;

import com.wind.crud.entity.User;
import com.wind.crud.service.EmployeeServiceImpl;
import com.wind.crud.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private EmployeeServiceImpl employeeService;

    //註冊帳號
    @RequestMapping("/toRegister")
    public String toRegister() {
        return "/emp/register";
    }

    //儲存註冊資料
    @RequestMapping("/registerSuccess")
    public String toAddSavePage(Model model,User user,String accountName){
        if (userService.queryByName(accountName)==null){
            int add = userService.addUser(user);
            System.out.println("資料新增成功");
            model.addAttribute("registerSuccess","註冊成功，請登錄");
            return "index";
        }else {
            model.addAttribute("accountError","帳號已經被註冊了!!!");
            return "/emp/register";
        }
    }

    //登錄方法
    @RequestMapping("/")
    public String toLogin(){
        return "index";
    }

    @RequestMapping("/loginSuccess")
    public String login(Model model, String accountName, String password, HttpSession session) {
        //帳號名稱是否正確
        User user = userService.queryByName(accountName);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("loginUser", user.getAccountName());
            return "redirect:/main.html";
        }
            model.addAttribute("userError","帳戶或密碼錯誤");
            return "index";

    }
    //登出
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index.html";
    }

}
