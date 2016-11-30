package com.xten.guice.bill.module;

import com.google.inject.AbstractModule;
import com.xten.guice.bill.remote.CreditCardProcessor;
import com.xten.guice.bill.remote.TransactionLog;
import com.xten.guice.bill.remote.impl.DatabaseTransactionLog;
import com.xten.guice.bill.remote.impl.PaypalCreditCardProcessor;
import com.xten.guice.bill.remote.mock.MockTransactionLog;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public class MockBillingModule extends AbstractModule {
    @Override
    protected void configure() {
         /*
      * This tells Guice that whenever it sees a dependency on a TransactionLog,
      * it should satisfy the dependency using a MockTransactionLog.
      */
        bind(TransactionLog.class).to(MockTransactionLog.class);

     /*
      * Similarly, this binding tells Guice that when CreditCardProcessor is used in
      * a dependency, that should be satisfied with a MockCreditCardProcessor.
      */
        bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
    }
}
