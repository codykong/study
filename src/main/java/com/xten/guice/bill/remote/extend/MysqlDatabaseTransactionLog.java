package com.xten.guice.bill.remote.extend;

import com.xten.guice.bill.remote.impl.DatabaseTransactionLog;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午4:59
 * To change this template use File | Settings | File Templates.
 */
public class MysqlDatabaseTransactionLog extends DatabaseTransactionLog {

    @Override
    public boolean writeLog(String log) {
        System.out.println("use mysql");
        return false;
    }
}
