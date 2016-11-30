package com.xten.thread.common;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/22
 * Time: 下午8:05
 * To change this template use File | Settings | File Templates.
 */
public class Test {


    public static void main(String[] args) {
        final MethodObject methodObject=new MethodObject();
        System.out.println(System.currentTimeMillis());
        for (int i=0;i<10;i++){
            new Thread(){

                @Override
                public void run() {
                    try {
                        methodObject.printTime();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }

    }
}
