package com.xten.guice.bill.start;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xten.guice.bill.module.BillingModule;
import com.xten.guice.bill.module.ConstructorModule;
import com.xten.guice.bill.service.BillingService;
import com.xten.guice.bill.service.ConstructorBillingService;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午5:00
 * To change this template use File | Settings | File Templates.
 */
public class ConstructorStart {

    public static void main(String[] args) {
        Injector injector= Guice.createInjector(new ConstructorModule());
        ConstructorBillingService billingService=injector.getInstance(ConstructorBillingService.class);

        String res= billingService.chargeOrder("100$","100");

        System.out.println(res);
    }
}
