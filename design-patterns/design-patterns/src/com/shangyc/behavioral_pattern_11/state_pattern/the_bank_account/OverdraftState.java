package com.shangyc.behavioral_pattern_11.state_pattern.the_bank_account;

//透支状态：具体状态类
public class OverdraftState extends AccountState {


    public OverdraftState(AccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void deposite(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    @Override
    public void stateCheck() {
        double balance = acc.getBalance();

        if(balance >0){
            acc.setAccountState(new NormalState(this));
        }else if(balance == -2000){
            acc.setAccountState(new RestrictedState(this));
        }else if(balance < -2000){
            System.out.println("操作受限！");
        }

    }
}