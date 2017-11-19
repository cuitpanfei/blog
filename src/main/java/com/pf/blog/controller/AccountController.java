package com.pf.blog.controller;

import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import com.pf.blog.service.IAccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RequestMapping("/user")
@Controller
public class AccountController extends BaseController{
    @Resource
    private IAccountService userAccountService;
    /**
     * 用户登录的入口方法
     *
     * @param request
     * @param userInfoBean 携带登陆用户的信息的对象
     * @return 重定向页面
     */
    @PostMapping(value = "/login")
    public String login(HttpServletRequest request, AccountAndUserWithBLOBs userInfoBean) {
        userInfoBean = this.userAccountService.login(userInfoBean);
        return userInfoBean!= null ? "redirect:/" : "redirect:/login.jsp?name=login-box";
    }
    @GetMapping(value = "/login")
    public String toLogin() {
        return "redirect:/login.jsp?name=login-box";
    }


    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg(HttpServletRequest request, AccountAndUserWithBLOBs user) {
        userAccountService.reg(user);
        return "redirect:/";
    }
    @GetMapping(value = "/reg")
    public String toReg() {
        return "redirect:/login.jsp";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }

    @RequestMapping(value = "/userInfo")
    public String userInfo(HttpServletRequest request) {
        return this.userAccountService.getUserInfo();
    }

}
