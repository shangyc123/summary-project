package com.shangyc.behavioral_pattern_11.strategy_pattern.discounted_movie_tickets;

public class Client {

    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        movieTicket.setPrice(100);

        Discount discount = new StudentDiscount();
        movieTicket.setDiscount(discount);

        System.out.println(movieTicket.getPrice());
    }
}
