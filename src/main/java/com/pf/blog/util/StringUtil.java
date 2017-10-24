package com.pf.blog.util;

import org.springframework.util.StringUtils;

/**
 * 字符串工具类
 */
public final class StringUtil {

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String strValue) {
        if(strValue!=null){
            strValue=strValue.trim();
        }
        return StringUtils.isEmpty(strValue);
    }
    /**
     * 判断字符串是否不为空
     */
    public static boolean isNotEmpty(String strValue) {
        return !isEmpty(strValue);
    }
}
