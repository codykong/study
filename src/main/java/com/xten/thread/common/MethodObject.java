package com.xten.thread.common;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/22
 * Time: 下午8:04
 * To change this template use File | Settings | File Templates.
 */
public class MethodObject {

    public void printTime() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(System.currentTimeMillis());
    }
}
