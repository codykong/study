package com.xten.guice.bill.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.xten.guice.bill.remote.CreditCardProcessor;
import com.xten.guice.bill.remote.TransactionLog;
import com.xten.guice.bill.remote.extend.MysqlDatabaseTransactionLog;
import com.xten.guice.bill.remote.impl.DatabaseTransactionLog;
import com.xten.guice.bill.remote.impl.PaypalCreditCardProcessor;
import com.xten.guice.bill.remote.mock.MockCreditCardProcessor;
import com.xten.guice.bill.remote.mock.MockTransactionLog;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public class ConstructorModule extends AbstractModule {
    @Override
    protected void configure() {

        bind(MysqlDatabaseTransactionLog.class);
        bind(PaypalCreditCardProcessor.class);
    }
}
