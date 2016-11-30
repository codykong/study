package com.xten.jdk;

import com.googlecode.javaewah.EWAHCompressedBitmap;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 2016/10/19
 * Time: 下午9:21
 * To change this template use File | Settings | File Templates.
 */
public class BitMapTest {


    public static void main(String[] args) {
        EWAHCompressedBitmap bitmap= new EWAHCompressedBitmap();

        bitmap.set(0);
        bitmap.set(1);
        bitmap.clear(1);
        System.out.println(bitmap.cardinality());
    }

}
