package com.cdkj.token.utils;


import com.cdkj.token.MyApplication;

/**
 * Created by lei on 2017/11/25.
 */

public class StringUtil {

    public static String getString(int resources){
        return MyApplication.getInstance().getString(resources);
    }
}
