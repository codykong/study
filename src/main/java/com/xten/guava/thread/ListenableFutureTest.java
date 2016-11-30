package com.xten.guava.thread;

import com.google.common.util.concurrent.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/9/8
 * Time: 下午4:44
 * To change this template use File | Settings | File Templates.
 */
public class ListenableFutureTest {
    static int i=0;

    public static void main(String[] args) throws InterruptedException {

        int size =10;

        final CountDownLatch latch =new CountDownLatch(1);
        ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(5));
        ListenableFuture[] totalFuture=new ListenableFuture[size];
        for (int i=0;i< size ;i++){
            final  int j=i;
            ListenableFuture queryResult= service.submit(new Callable<Boolean>() {
                @Override
                public Boolean call() throws Exception {

                    int sleep=new Random().nextInt(3000);
                    Thread.sleep(sleep);
                    boolean res = new Random().nextBoolean();
                    return res;
                }
            });

            totalFuture[i] =queryResult;

        }

        ListenableFuture all =Futures.allAsList(totalFuture);

        Futures.addCallback(all, new FutureCallback<List<Boolean>>() {
            @Override
            public void onSuccess(List<Boolean> result) {
                for (Boolean res :result){
                    System.out.println(res);
                    latch.countDown();
                }
            }

            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("error:"+throwable);
                latch.countDown();
            }
        });

        latch.await();

        service.shutdown();
        System.out.println("has shutdown");




    }

    private static void checkResult(boolean res){
        i++;
        if (i==4){

        }
//        if (res){
//            System.out.println("success");
//        }else {
//            System.out.println("failed");
//        }
    }


}
