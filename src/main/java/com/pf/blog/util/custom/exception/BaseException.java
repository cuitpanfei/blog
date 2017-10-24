package com.pf.blog.util.custom.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by cuitpanfei on 2017/10/23.
 */
public class BaseException extends Exception implements DefaultExceptionImpl {
    public static Logger LOGGER;
    public BaseException(String message){
        super(message);
        LOGGER = LoggerFactory.getLogger(getName());
    }
    protected String getName(){
        return getClass().getName();
    }
}
