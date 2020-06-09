package com.lagou.springcluster.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * \* @Author: ZhuFangTao
 * \* @Date: 2020/5/19 10:31 上午
 * \
 */
@Component
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(checkedRequest(request) || staticResource(request)){
            return true;
        }
        response.sendRedirect("/lagou/user/login");
        return false;
    }

    private boolean checkedRequest(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return request.getRequestURI().contains("/user/")
                || session.getAttribute("user") != null;
    }

    private boolean staticResource(HttpServletRequest request) {
        String url = request.getRequestURI();
        return url.endsWith(".js") || url.endsWith(".css") || url.endsWith(".jpg");
    }
}