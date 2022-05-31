package com.shangyc.behavioral_pattern_11.state_pattern.the_bank_account;

public class Client {


    public static void main(String[] args) {
        Account account = new Account("有钱人",0.0);

        account.deposit(2000);
        account.deposit(2000);
        account.deposit(5000);
        account.withDraw(9000);
        account.withDraw(1000);
        account.withDraw(2000);
        account.withDraw(9000);
        account.computeInterest();
    }
}
