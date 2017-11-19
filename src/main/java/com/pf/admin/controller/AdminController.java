package com.pf.admin.controller;

import com.pf.admin.service.IAdminService;
import com.pf.blog.bean.SearchResults;
import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import com.pf.util.JsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by cuitpanfei on 2017/11/1.
 */
@RequestMapping("/admin")
@Controller
public class AdminController extends BaseLogger {

    @Resource
    private IAdminService adminService;
    /**
     * 管理员登录的入口方法
     *
     * @param request
     * @param userInfoBean 携带登陆管理员的信息的对象
     * @return 重定向页面
     */
    @PostMapping(value = "/adminLogin")
    public String login(HttpServletRequest request, AccountAndUserWithBLOBs userInfoBean) {
        userInfoBean = this.adminService.adminLogin(userInfoBean);
        return userInfoBean!= null ? "redirect:/admin/index.action" : "redirect:/admin/login.action";
    }

    /**
     *
     * @return 登陆页
     */
    @GetMapping(value = "/login")
    public String login(HttpServletRequest request) {
        return "/admin/adminLogin";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String toIndex(HttpServletRequest request, AccountAndUserWithBLOBs userInfoBean) {
        userInfoBean = ((AccountAndUserWithBLOBs) (request.getSession().getAttribute("userinfo") == null ? request.getSession().getAttribute("admin") : request.getSession().getAttribute("userinfo")));
        if(userInfoBean != null && "1".equals(userInfoBean.getUserPower())){
            request.getSession().setAttribute("admin",userInfoBean);
            request.getSession().setAttribute("userinfo",userInfoBean);
        }else if(userInfoBean!=null){
            userInfoBean = null;
        }else{

        }
        return userInfoBean!= null ? "/admin/adminIndex" : "/admin/adminLogin";
    }
    @RequestMapping(value = "/loginout", method = RequestMethod.GET)
    public String forIndex(HttpServletRequest request) {
        request.getSession().removeAttribute("admin");
        return "redirect:/";
    }

    /**
     * @param request
     * @return 将List格式化为JSON后的String数据
     */
    @RequestMapping(value = "/search_results.action?top-search={search}", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String search_results(@PathVariable String search,HttpServletRequest request) {
        SearchResults results =  adminService.searchResults(search);
        return JsonUtil.getInstance().obj2json(results);
    }
}
