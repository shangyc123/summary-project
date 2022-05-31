package com.shangyc.behavioral_pattern_11.state_pattern.the_bank_account;

//受限状态：具体状态类
public class RestrictedState extends AccountState {


    public RestrictedState(AccountState state){
        this.acc = state.acc;
    }


    @Override
    public void deposite(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("帐号受限，取款失败");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    public void stateCheck() {

        double balance = acc.getBalance();
        if(balance > 0){
            acc.setAccountState(new NormalState(this));
        }else if(balance < -2000){
            acc.setAccountState(new OverdraftState(this));
        }
    }
}