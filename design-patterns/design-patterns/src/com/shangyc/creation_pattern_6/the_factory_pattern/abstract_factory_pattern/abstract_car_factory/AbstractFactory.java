package com.shangyc.creation_pattern_6.the_factory_pattern.abstract_factory_pattern.abstract_car_factory;


public abstract class AbstractFactory {

    public void  getCar(){
        Car car = this.buildCar();
        car.run();
    }

    public abstract Car buildCar();
}





