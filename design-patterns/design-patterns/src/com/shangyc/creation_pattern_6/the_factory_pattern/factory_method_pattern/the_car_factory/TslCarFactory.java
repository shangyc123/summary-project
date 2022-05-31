package com.shangyc.creation_pattern_6.the_factory_pattern.factory_method_pattern.the_car_factory;

public class TslCarFactory implements Factory {

    @Override
    public Car BuildCar() {
        return new TslCar();
    }
}
