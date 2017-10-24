package com.pf.blog.util;

import org.apache.commons.collections.MapUtils;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具类
 */
public final class CollectionUtil {

    /**
     * 判断Collection是否为空
     */
    public static boolean isEmpty(Collection<?> collection){
     return CollectionUtils.isEmpty(collection);
    }
    /**
     * 判断Collection是否为非空
     */
    public static boolean isNotEmpty(Collection<?> collection){
     return !isEmpty(collection);
    }
    /**
     * 判断Collection是否为空
     */
    public static boolean isEmpty(Map<?,?> map){
     return MapUtils.isEmpty(map);
    }
    /**
     * 判断Collection是否为非空
     */
    public static boolean isNotEmpty(Map<?,?> map){
     return !isEmpty(map);
    }
}
