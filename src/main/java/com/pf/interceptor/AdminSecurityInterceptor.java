package com.pf.interceptor;

import com.pf.blog.entity.AccountAndUser;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AdminSecurityInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object obj = request.getSession().getAttribute("admin");
        StringBuffer urlRedirect = new StringBuffer(request.getContextPath());
        if (obj == null || !(obj instanceof AccountAndUser)) {
            urlRedirect.append("/admin/login.action");
        }
        //如果strRedirect增加字符
        if(!(request.getContextPath()).equals(urlRedirect.toString())){
            request.getSession().invalidate();
            response.sendRedirect(urlRedirect.toString());
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
