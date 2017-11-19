package com.pf.util;

/**
 * Created by Administrator on 2017/10/25.
 */
public class LoggerMessageUtil {

    public static String creatInfo(final String userName,final int accountId,final String message){
        return "";
    }
    public static String creatInfo(int accountId,String message){
        return creatInfo(null,accountId,message);
    }
    public static String creatInfo(String userName,String message){
        return creatInfo(userName,0,message);
    }
}
