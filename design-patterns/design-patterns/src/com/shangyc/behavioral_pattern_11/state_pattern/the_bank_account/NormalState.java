package com.shangyc.behavioral_pattern_11.state_pattern.the_bank_account;

public class NormalState extends AccountState {


    public NormalState(Account account) {
        this.acc = account;
    }

    public NormalState(AccountState state){
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
        System.out.println("正常状态，无须支付利息！");
    }

    @Override
    public void stateCheck() {

        if(acc.getBalance()> -2000 && acc.getBalance() < 0){
            acc.setAccountState(new OverdraftState(this));
        }else if(acc.getBalance() == -2000){
            acc.setAccountState(new RestrictedState(this));
        }else if(acc.getBalance() < -2000){
            System.out.println("操作受限！");
            //acc.setAccountState(new OverdraftState(this));
        }

    }
}
