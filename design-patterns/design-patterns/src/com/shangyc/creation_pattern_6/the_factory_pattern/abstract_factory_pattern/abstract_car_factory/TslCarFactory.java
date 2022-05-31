package com.shangyc.creation_pattern_6.the_factory_pattern.abstract_factory_pattern.abstract_car_factory;

public class TslCarFactory extends AbstractFactory {

    @Override
    public TslCar buildCar() {
        return new TslCar() ;
    }
}
