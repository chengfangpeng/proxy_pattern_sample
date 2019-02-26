package com.cfp.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by cfp on 19-2-26.
 */
public class Client {

    public static void main(String[] args) {
        IInvestor investor = new Investor("张三");
        InvocationHandler handler = new InvestorIH(investor);
        ClassLoader cl = investor.getClass().getClassLoader();
        IInvestor proxy = (IInvestor) Proxy.newProxyInstance(cl, new Class[]{Investor.class}, handler);
        proxy.login("zhangsan", "123");
        proxy.buyStock();
        proxy.sellStock();
    }



}
