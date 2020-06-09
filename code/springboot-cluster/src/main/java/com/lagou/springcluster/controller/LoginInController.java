package com.lagou.springcluster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * \* User: ZhuFangTao
 * \* Date: 2020/6/8 1:12 下午
 * \
 */
@Controller
@RequestMapping("/user")
public class LoginInController {


    @GetMapping(value = "/login")
    public String userLoginPage(){
        return "login/index";
    }

    @PostMapping(value = "/check")
    @ResponseBody
    public String check(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if ("admin".equals(userName) && "admin".equals(password)) {
            request.getSession().setAttribute("user", userName);
            return "login success";
        }else{
            return "login failed";
        }
    }

}