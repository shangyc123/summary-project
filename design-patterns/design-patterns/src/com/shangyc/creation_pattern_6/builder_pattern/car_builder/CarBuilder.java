package com.shangyc.creation_pattern_6.builder_pattern.car_builder;

public class CarBuilder implements Builder {
    public BydCar bydCar;

    public CarBuilder(BydCar bydCar) {
        this.bydCar = bydCar;
    }

    @Override
    public void buildModel() {
        bydCar.setModelCar("model build success");
    }

    @Override
    public void buildCircle() {
        bydCar.setCircle("circle build success");
    }

    @Override
    public BydCar getCar() {
        return bydCar;
    }
}
