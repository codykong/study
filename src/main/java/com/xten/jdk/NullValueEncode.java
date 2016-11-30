package com.xten.jdk;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 2016/10/24
 * Time: 上午10:55
 * To change this template use File | Settings | File Templates.
 */
public class NullValueEncode {

    public static void main(String[] args) {

        String s="\0";

        String a ="";
        String b =" ";


        System.out.println(s.equals(a));
        System.out.println(s.equals(b));
    }
}
