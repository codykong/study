package com.xten.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 2016/10/19
 * Time: 下午8:07
 * To change this template use File | Settings | File Templates.
 */
public class FlatMapTest {

    public static void main(String[] args) {

        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );

        List<Integer> res = inputStream.flatMap(child -> child.stream()).filter(i -> i %2== 0).map(i -> i+1).peek(e -> System.out.println(e)).collect(Collectors.toList());
        System.out.println(res);
    }
}
