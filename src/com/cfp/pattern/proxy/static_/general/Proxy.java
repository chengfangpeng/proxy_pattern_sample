package com.cfp.pattern.proxy.static_.general;

/**
 * Created by cfp on 19-2-26.
 */
public class Proxy implements Subject {


    /** 要代理哪个实现类 */
    private Subject subject = null;

    public Proxy(Subject subject){
        this.subject = subject;
    }
    @Override
    public void doSomething() {
        before();
        subject.doSomething();
        after();
    }

    /**
     * 预处理
     */
    private void before(){
    }

    /**
     * 善后处理
     */
    private void after(){
    }
}
