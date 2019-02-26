package com.cfp.pattern.proxy.static_;

/**
 * Created by cfp on 19-2-26.
 */
public interface IInvestor {

    /**
     * 登录股票账户
     * @param user
     * @param password
     */
    void login(String user, String password);

    /**
     * 买股票
     */
    void buyStock();

    /**
     * 卖股票
     */
    void sellStock();
}
