package com.xten.guava;

import com.google.common.collect.Range;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 2016/11/17
 * Time: 上午10:58
 * To change this template use File | Settings | File Templates.
 */
public class RangeStudy {

    public static void main(String[] args) {
        System.out.println(Range.closed(3, 4).span(Range.open(5, 10)));

    }
}
