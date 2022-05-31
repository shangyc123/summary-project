package com.shangyc.behavioral_pattern_11.state_pattern.the_bank_account;



//银行账户：环境类
public class Account {
    //维持一个对抽象状态对象的引用
    private AccountState accountState;
    //开户名
    private String owner;
    //账户余额
    private double balance = 0;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        //设置初始状态
        this.accountState = new NormalState(this);
        System.out.println(this.owner + "开户，初始金额为" + balance);
        System.out.println("---------------------------------------------");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }


    public void deposit(double amount){
        System.out.println(this.owner + "存款" + amount);
        //调用状态对象的deposit()方法
        accountState.deposite(amount);
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this.accountState.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    public void  withDraw(double amount){
        System.out.println(this.owner + "取钱" + amount);
        //调用状态对象的withdraw()方法
        accountState.withdraw(amount);
        System.out.println("现在余额为"+ this.balance);
        System.out.println("现在帐户状态为"+ this.accountState.getClass().getName());
        System.out.println("---------------------------------------------");
    }

    //调用状态对象的computeInterest()方法
    public void computeInterest(){
        accountState.computeInterest();
    }

}