package com.xten.guice.bill.start;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xten.guice.bill.module.ConstructorModule;
import com.xten.guice.bill.service.ConstructorBillingService;
import com.xten.guice.bill.service.MethodBillingService;

/**
 * Created with IntelliJ IDEA.
 * User: cody
 * Date: 16/8/12
 * Time: 下午5:00
 * To change this template use File | Settings | File Templates.
 */
public class MethodStart {

    public static void main(String[] args) {
//        Injector injector= Guice.createInjector(new MockBillingModule());
        Injector injector= Guice.createInjector(new ConstructorModule());
        MethodBillingService billingService=injector.getInstance(MethodBillingService.class);

        String res= billingService.chargeOrder("100$","100");

        System.out.println(res);
    }
}
