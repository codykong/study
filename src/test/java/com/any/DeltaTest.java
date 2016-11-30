package com.any;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 2016/11/10
 * Time: 下午3:09
 * To change this template use File | Settings | File Templates.
 */
public class DeltaTest {

    public static void main(String[] args) {

        String value ="20160101";
        String delta ="1";

        Map<String,String> deltaMap = Maps.newHashMap();

        String key = value+"&"+delta;
        String res = deltaMap.get(key);
        if (res == null){
            res =calcRangeField(value,delta);
        }
        System.out.println(res);
    }

    private static String calcRangeField(String value,String delta){

        return ""+(Integer.valueOf(value)-1);
    }
}
