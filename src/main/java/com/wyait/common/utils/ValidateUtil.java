package com.wyait.common.utils;

/**
 * @Auther: 托马斯
 * @Date: 2018-12-21 10:34
 * @Description:
 */

public class ValidateUtil {
    public static Boolean isMobilephone(String mobile){
        if (mobile.length()==11){
            return true;
        }else {
            return false;
        }
    }

    public static Boolean isPicCode(String picCode){
        return true;
    }

    public static Boolean isCode(String picCode){
        return true;
    }

    public static Boolean isSimplePassword(String picCode){
        return true;
    }
}
