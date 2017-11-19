package com.pf.blog.controller;

import com.pf.blog.entity.withblobs.AccountAndUserWithBLOBs;
import com.pf.blog.entity.Schedule;
import com.pf.blog.service.IScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.pf.util.FormatUtil.ListToJson;

/**
 * Created by cuitpanfei on 2017/10/25.
 */
@RequestMapping("/user/events")
@Controller
public class ScheduleController extends BaseController{

    @Resource
    private IScheduleService scheduleService;

    @RequestMapping(value="removeAll.action",method = RequestMethod.POST)
    public void removeAllSchedule(HttpServletRequest request){
        this.scheduleService.removeALL();
    }

    /**
     * @param request
     * @return 将List格式化为JSON后的String数据
     */
    @RequestMapping(value = "/getEvents.action", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getUnfinishedEvents(HttpServletRequest request) {
        List<Schedule> list = (List<Schedule>) request.getSession().getAttribute("Events");
        AccountAndUserWithBLOBs userinfo = (AccountAndUserWithBLOBs) request.getSession().getAttribute("userinfo");
        if(list == null && userinfo != null){
                list = this.scheduleService.getEvents(userinfo.accountGet());
        }
        return ListToJson(list);
    }
}
