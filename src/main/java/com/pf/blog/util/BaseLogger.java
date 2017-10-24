package com.pf.blog.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by cuitpanfei on 2017/10/24.
 */
public class BaseLogger {
    public static Logger LOGGER;

    public BaseLogger(){
        LOGGER = LoggerFactory.getLogger(getName());
    }
    protected String getName(){
        return getClass().getName();
    }

}
