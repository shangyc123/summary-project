package com.shangyc.behavioral_pattern_11.strategy_pattern.discounted_movie_tickets;


//折扣类：抽象策略类
public interface  Discount {
    double calculate(double price);
}

