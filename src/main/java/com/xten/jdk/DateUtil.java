package com.xten.jdk;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/10/17
 * Time: 下午8:15
 * To change this template use File | Settings | File Templates.
 */
public class DateUtil {

    public static void main(String[] args) throws InterruptedException {

        long a =System.currentTimeMillis();
        Thread.sleep(1000);
        System.out.println(System.currentTimeMillis() -a);
    }
}
