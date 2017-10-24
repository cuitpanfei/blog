package com.pf.blog.util;

import static com.pf.blog.util.RandomValue.getNum;

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
        return getNum(100000000,999999999);
    }

}
