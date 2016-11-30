package com.xten.guice.bill.remote.mock;

import com.xten.guice.bill.remote.CreditCardProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:59
 * To change this template use File | Settings | File Templates.
 */
public class MockCreditCardProcessor implements CreditCardProcessor {

    @Override
    public boolean charge(String fee) {
        return true;
    }
}
