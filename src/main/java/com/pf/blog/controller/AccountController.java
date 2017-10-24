package com.pf.blog.controller;

import com.pf.blog.bean.AccountAndUser;
import com.pf.blog.bean.UserInfoBean;
import com.pf.blog.entity.Schedule;
import com.pf.blog.service.IAccountService;
import com.pf.blog.service.IScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.pf.blog.util.FormatUtil.ListToJson;

@RequestMapping("/user")
@Controller
public class AccountController extends BaseController{
    @Resource
    private IAccountService userAccountService;
    @Resource
    private IScheduleService scheduleService;

    /**
     * 用户登录的入口方法
     *
     * @param request
     * @param userInfoBean 携带登陆用户的信息的对象
     * @return 重定向页面
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, UserInfoBean userInfoBean) {
        AccountAndUser userinfo = this.userAccountService.login(userInfoBean);
        return userinfo.getUser() != null ? "redirect:/" : "redirect:/login.jsp?name=login-box";
    }


    @RequestMapping(value = "/reg.action", method = RequestMethod.POST)
    public String reg(HttpServletRequest request, UserInfoBean user) {
        userAccountService.reg(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/logout.action")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }

    @RequestMapping(value = "/userInfo.action")
    public String userInfo(HttpServletRequest request) {
        return "showUser";
    }

    /**
     * @param request
     * @return 将List格式化为JSON后的String数据
     */
    @RequestMapping(value = "/events.action", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getUnfinishedEvents(HttpServletRequest request) {
        AccountAndUser userinfo = (AccountAndUser) request.getSession().getAttribute("userinfo");
        List<Schedule> list = this.scheduleService.getEvents(userinfo.getAccount().getAccountId());
        return ListToJson(list);
    }
}
