package com.shangyc.behavioral_pattern_11.chain_of_responsibility_pattern;
/**
 * 主任，具体处理者
 */
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }


    //具体请求处理方法
    @Override
    public void processRequest(PurchaseRequest request) {

        if(request.getAmount() < 50000){
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");
        }else {
            //转发请求
            this.successor.processRequest(request);
        }

    }
}
