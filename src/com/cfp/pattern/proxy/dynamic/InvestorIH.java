package com.cfp.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cfp on 19-2-26.
 */
public class InvestorIH implements InvocationHandler {

    /** 被代理者 */
    private Class mCls = null;
    /** 被代理的实例 */
    private Object mObj = null;

    public InvestorIH(Object obj){
        this.mObj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.mObj, args);
        return result;
    }
}
