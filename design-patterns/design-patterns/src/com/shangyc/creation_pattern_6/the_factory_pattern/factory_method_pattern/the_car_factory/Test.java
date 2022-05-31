package com.shangyc.creation_pattern_6.the_factory_pattern.factory_method_pattern.the_car_factory;

public class Test {

    public static void main(String args[]){
        Factory benChiFactory = new BenChiCarFactory();

        Car car = benChiFactory.BuildCar();

        car.run();
    }
}
