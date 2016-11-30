package com.xten.guice.bill.remote.impl;

import com.xten.guice.bill.remote.CreditCardProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:59
 * To change this template use File | Settings | File Templates.
 */
public class PaypalCreditCardProcessor implements CreditCardProcessor {

    @Override
    public boolean charge(String fee) {
        return false;
    }
}
