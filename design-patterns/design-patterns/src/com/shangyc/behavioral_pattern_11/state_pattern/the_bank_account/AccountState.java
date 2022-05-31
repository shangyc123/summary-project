package com.shangyc.behavioral_pattern_11.state_pattern.the_bank_account;



//抽象状态类
public abstract class AccountState {

    protected Account acc;

    public abstract void deposite(double amoutn);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();

}
