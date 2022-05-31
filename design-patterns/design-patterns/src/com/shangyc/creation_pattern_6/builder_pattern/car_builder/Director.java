package com.shangyc.creation_pattern_6.builder_pattern.car_builder;

public class Director {

    public BydCar create(Builder builder){
        builder.buildModel();
        builder.buildCircle();
        return builder.getCar();
    }

}
