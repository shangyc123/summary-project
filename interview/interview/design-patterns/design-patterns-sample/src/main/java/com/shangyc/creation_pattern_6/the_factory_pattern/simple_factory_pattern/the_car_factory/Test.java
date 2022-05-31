package com.shangyc.creation_pattern_6.the_factory_pattern.simple_factory_pattern.the_car_factory;

public class Test {

    public static void main(String args[]) throws InstantiationException, IllegalAccessException {

        SimpleFactory factory = new SimpleFactory();
        Car car = factory.buildCar(TslCar.class);
        car.run();

        Car car1 = factory.buildCar(BenChiCar.class);
        car1.run();

    }
}
