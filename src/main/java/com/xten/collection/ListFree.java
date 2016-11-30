package com.xten.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 2016/10/24
 * Time: 下午4:06
 * To change this template use File | Settings | File Templates.
 */
public class ListFree {

    public static void main(String[] args) {

        int[] ids = new int[2];
        ids[0]=1;

        for (int i =0;i <ids.length;i++){
            int id =ids[i];
            System.out.println(id);
        }
        System.out.println(ids.toString());
    }
}
