package com.wind.crud.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登錄成功之後，應該有用戶的session
        Object loginUser = request.getSession().getAttribute("loginUser");
        //沒有登錄
        if (loginUser == null) {
            request.setAttribute("userError", "請先登錄");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            return true;
        }
    }
}
