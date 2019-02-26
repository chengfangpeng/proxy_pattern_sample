package com.cfp.pattern.proxy.static_;

/**
 * 操盘手
 * Created by cfp on 19-2-26.
 */
public class InvestorProxy implements IInvestor {


    private IInvestor mInvestor;

    public InvestorProxy(IInvestor investor){
        this.mInvestor = investor;
    }

    @Override
    public void login(String user, String password) {
        mInvestor.login(user, password);
    }

    @Override
    public void buyStock() {
        mInvestor.buyStock();
        fee();
    }

    @Override
    public void sellStock() {
        mInvestor.sellStock();
        fee();
    }

    public void fee(){
        System.out.println("买卖股票费用： 100元");
    }
}
