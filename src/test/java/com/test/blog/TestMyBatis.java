package com.test.blog;

import com.alibaba.fastjson.JSON;
import com.pf.blog.entity.User;
import com.pf.blog.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
        userService = (IUserService) ac.getBean("userService");
    }

    @Test
    public void test1() {
        User user = userService.getObjectById(1);
        logger.info(JSON.toJSONString(user));
    }

    @Test
    public void initDateBase() {
        User user = userService.getObjectById(1);
        logger.info(JSON.toJSONString(user));
    }

}
