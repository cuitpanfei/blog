package com.pf.blog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by cuitpanfei on 2017/10/24.
 */
public class BaseServiceImpl extends BaseLogger {
    @Autowired
    protected HttpSession session;

    @Autowired
    protected HttpServletRequest request;
}
