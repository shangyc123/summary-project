package com.shangyc.behavioral_pattern_11.chain_of_responsibility_pattern;

/**
 * 采购单请求类
 */
public class PurchaseRequest {

    //采购金额
    private double amount;
    //采购单编号
    private int number;
    //采购目的
    private String purpose;

    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}