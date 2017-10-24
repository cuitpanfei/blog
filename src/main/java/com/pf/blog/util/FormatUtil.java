package com.pf.blog.util;

import com.alibaba.fastjson.JSON;

import java.util.Date;
import java.util.List;

/**
 * JSON格式化工具类
 *
 * @author cuitpf
 */
public class FormatUtil {
    /**
     * 将传入的Object格式化给JSON数据
     *
     * @param entity 将被格式化的一个对象
     * @return
     */
    public static String ObjToJson(Object entity) {
        return JSON.toJSONString(entity);
    }

    /**
     * 将一个list集合对象格式化为JSON数据
     *
     * @param list
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static String ListToJson(List list) {
        return JSON.toJSONString(list);
    }

    public static String DateToString(Date date){
        return "";
    }
}
