package com.any;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/16
 * Time: 下午7:35
 * To change this template use File | Settings | File Templates.
 */
public class StaticTest {



    public static void main(String[] args) {
        int j= StaticObj.i;
        System.out.println(j);
        StaticObj.i=3;
        System.out.println(StaticObj.i);
    }
}
