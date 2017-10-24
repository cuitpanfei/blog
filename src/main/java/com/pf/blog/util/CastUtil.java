package com.pf.blog.util;

/**
 * 转型工具类
 */
public final class CastUtil {
    /**
     * 转换为String
     * @param obj 被转换对象
     */
    public static String castString(Object obj){
       return CastUtil.castString(obj,"");
    }

    /**
     * 转换为String，提供默认值
     * @param obj 被转换对象
     * @param defultValue 默认值
     */
    private static String castString(Object obj, String defultValue) {
        return obj!=null?String.valueOf(obj):defultValue;
    }

    /**
     * 转换为double
     * @param obj 被转换对象
     */
    public static double castDouble(Object obj){
        return CastUtil.castDouble(obj,0);
    }

    /**
     * 转换为double，提供默认值
     * @param obj 被转换对象
     * @param defultValue 默认值
     */
    private static double castDouble(Object obj, double defultValue) {
        double doubleValue = defultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    doubleValue = Double.parseDouble(strValue);
                }catch (NumberFormatException e) {
                    doubleValue = defultValue;
                }
            }
        }
        return doubleValue;
    }
    /**
     * 转换为int
     * @param obj 被转换对象
     */
    public static int castInt(Object obj){
        return CastUtil.castInt(obj,0);
    }

    /**
     * 转换为int，提供默认值
     * @param obj 被转换对象
     * @param defultValue 默认值
     */
    private static int castInt(Object obj, int defultValue) {
        int intValue = defultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    intValue = Integer.parseInt(strValue);
                }catch (NumberFormatException e) {
                    intValue = defultValue;
                }
            }
        }
        return intValue;
    }
    /**
     * 转换为long
     * @param obj 被转换对象
     */
    public static long castLong(Object obj){
        return CastUtil.castLong(obj,0);
    }

    /**
     * 转换为long，提供默认值
     * @param obj 被转换对象
     * @param defultValue 默认值
     */
    private static long castLong(Object obj, long defultValue) {
        long LongValue = defultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try{
                    LongValue = Integer.parseInt(strValue);
                }catch (NumberFormatException e) {
                    LongValue = defultValue;
                }
            }
        }
        return LongValue;
    }
    /**
     * 转换为boolean
     * @param obj 被转换对象
     */
    public static boolean castBoolean(Object obj){
        return CastUtil.castBoolean(obj,false);
    }

    /**
     * 转换为boolean，提供默认值
     * @param obj 被转换对象
     * @param defultValue 默认值
     */
    private static boolean castBoolean(Object obj, boolean defultValue) {
        boolean booleanValue = defultValue;
        if(obj != null){
           booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }
}
