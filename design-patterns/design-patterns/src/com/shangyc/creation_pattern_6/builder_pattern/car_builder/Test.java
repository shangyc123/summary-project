package com.shangyc.creation_pattern_6.builder_pattern.car_builder;

public class Test {

    public static void main(String args[]){
           Director director = new Director();

        Builder builder = new CarBuilder(new BydCar());

        BydCar bydCar = director.create(builder);

        System.out.println(bydCar.getCircle());
        System.out.println(bydCar.getModelCar());
    }
}
