package com.xten.guice.bill.remote;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:53
 * To change this template use File | Settings | File Templates.
 */
public interface CreditCardProcessor {

    boolean charge(String fee);
}
