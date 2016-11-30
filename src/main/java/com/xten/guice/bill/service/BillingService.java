package com.xten.guice.bill.service;

import com.google.inject.Inject;

import com.google.inject.name.Named;
import com.xten.guice.bill.remote.CreditCardProcessor;
import com.xten.guice.bill.remote.TransactionLog;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:53
 * To change this template use File | Settings | File Templates.
 */
public class BillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;
    private final String jdbc;

    @Inject
    BillingService(CreditCardProcessor processor,
                   @Named("mock")TransactionLog transactionLog,@Named("jdbc") String jdbc) {
        this.processor = processor;
        this.transactionLog = transactionLog;
        this.jdbc=jdbc;
    }

    public String chargeOrder(String order, String creditCard) {
        String res=order+":"+creditCard+jdbc;
        transactionLog.writeLog(order);
        processor.charge(creditCard);
        return  res;
    }
}
