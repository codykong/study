package com.xten.guice.bill.remote.mock;

import com.xten.guice.bill.remote.TransactionLog;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:59
 * To change this template use File | Settings | File Templates.
 */
public class MockTransactionLog implements TransactionLog {
    @Override
    public boolean writeLog(String log) {
        System.out.println("MockTransactionLog");
        return true;
    }
}
