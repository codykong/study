package com.xten.stream;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/10/10
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> out =new ArrayList<>();
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        out = numbers.stream().sorted().map((x) -> {
            return x*x;
        }).collect(Collectors.toList());
        System.out.println(out);
    }

    @Test
    public void testSortAndMap(){

        List<Transaction> transactions =new ArrayList<>();
        Random r=new Random();
        for (int i=0;i<10;i++){
            Transaction transaction =new Transaction(i,r.nextInt(100),r.nextInt(3));
            transactions.add(transaction);
        }

        System.out.println(new Gson().toJson(transactions));

        List<Integer> res = transactions.parallelStream()
                .filter(t -> t.getType() == 1)
                .sorted(Comparator.comparing(Transaction :: getValue).reversed())
                .map(Transaction :: getId)
                .collect(Collectors.toList());

        System.out.println(new Gson().toJson(res));
    }


}
