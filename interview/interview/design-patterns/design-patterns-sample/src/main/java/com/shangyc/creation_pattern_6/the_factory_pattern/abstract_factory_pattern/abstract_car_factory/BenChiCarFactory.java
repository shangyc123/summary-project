package com.shangyc.creation_pattern_6.the_factory_pattern.abstract_factory_pattern.abstract_car_factory;

public class BenChiCarFactory extends AbstractFactory {

    public Car buildCar() {
        BenChiCar benChiCar = new BenChiCar();
        return benChiCar;
    }
}
