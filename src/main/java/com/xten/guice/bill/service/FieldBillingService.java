package com.xten.guice.bill.service;

import com.google.inject.Inject;
import com.xten.guice.bill.remote.CreditCardProcessor;
import com.xten.guice.bill.remote.TransactionLog;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:53
 * To change this template use File | Settings | File Templates.
 */
public class FieldBillingService {

    @Inject private CreditCardProcessor processor;
    @Inject private TransactionLog transactionLog;
    public FieldBillingService(){};

    public String chargeOrder(String order, String creditCard) {
        String res=order+":"+creditCard;
        transactionLog.writeLog(order);
        processor.charge(creditCard);
        return  res;
    }
}
