package com.shangyc.creation_pattern_6.the_factory_pattern.abstract_factory_pattern.abstract_car_factory;

public class Test {

    public static void main(String args[]){
        AbstractFactory benChiFactory = new BenChiCarFactory();
        benChiFactory.getCar();

    }
}
