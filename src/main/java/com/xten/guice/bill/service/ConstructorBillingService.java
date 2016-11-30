package com.xten.guice.bill.service;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.xten.guice.bill.remote.CreditCardProcessor;
import com.xten.guice.bill.remote.TransactionLog;
import com.xten.guice.bill.remote.impl.DatabaseTransactionLog;
import com.xten.guice.bill.remote.impl.PaypalCreditCardProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:53
 * To change this template use File | Settings | File Templates.
 */
public class ConstructorBillingService {
    private final CreditCardProcessor processor;
    private final TransactionLog transactionLog;

    @Inject
    ConstructorBillingService(PaypalCreditCardProcessor processor,
                              DatabaseTransactionLog transactionLog, String jdbc) {
        this.processor = processor;
        this.transactionLog = transactionLog;
    }

    public String chargeOrder(String order, String creditCard) {
        String res=order+":"+creditCard;
        transactionLog.writeLog(order);
        processor.charge(creditCard);
        return  res;
    }
}
