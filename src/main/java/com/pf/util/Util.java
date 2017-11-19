package com.pf.util;

import javax.servlet.http.HttpServletRequest;

public class Util {

    /**
     *
     * @return 时钟序列
     */
    private static Integer getIntValue() {
        return new Integer((int) System.currentTimeMillis());
    }

    /**
     *
     * @return 一个非零的随机数
     */
    public static int getKey() {
        return RandomValue.getNum(100000000,999999999);
    }

    public static String getIp(HttpServletRequest request) {
        String ip = request.getHeader("X-Forwarded-For");
        if(StringUtil.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            //多次反向代理后会有多个ip值，第一个ip才是真实ip
            int index = ip.indexOf(",");
            if(index != -1){
                return ip.substring(0,index);
            }else{
                return ip;
            }
        }
        ip = request.getHeader("X-Real-IP");
        if(StringUtil.isNotEmpty(ip) && !"unKnown".equalsIgnoreCase(ip)){
            return ip;
        }
        return request.getRemoteAddr();
    }

}
