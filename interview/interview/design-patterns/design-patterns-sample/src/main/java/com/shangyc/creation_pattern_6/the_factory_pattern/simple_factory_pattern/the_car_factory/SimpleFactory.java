package com.shangyc.creation_pattern_6.the_factory_pattern.simple_factory_pattern.the_car_factory;

public class SimpleFactory {

    public static Car buildCar(Class<? extends Car> c) throws IllegalAccessException, InstantiationException {
        Car car = c.newInstance();
        return car;
    }

}
