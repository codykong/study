package com.xten.guice.bill.start;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xten.guice.bill.module.BillingModule;
import com.xten.guice.bill.module.MockBillingModule;
import com.xten.guice.bill.service.BillingService;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午5:00
 * To change this template use File | Settings | File Templates.
 */
public class start {

    public static void main(String[] args) {
//        Injector injector= Guice.createInjector(new MockBillingModule());
        Injector injector= Guice.createInjector(new BillingModule());
        BillingService billingService=injector.getInstance(BillingService.class);

        String res= billingService.chargeOrder("100$","100");

        System.out.println(res);
    }
}
