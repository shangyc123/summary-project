package com.shangyc.behavioral_pattern_11.strategy_pattern.discounted_movie_tickets;

//VIP会员票折扣类：具体策略类
public class VIPDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("VIP票：");
        return price * 0.88;
    }
}