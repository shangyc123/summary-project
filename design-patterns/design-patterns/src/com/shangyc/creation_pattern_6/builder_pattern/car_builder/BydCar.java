package com.shangyc.creation_pattern_6.builder_pattern.car_builder;

public class BydCar {

    //汽车模具
    private String modelCar;

    //汽车轮子
    private String circle;

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getCircle() {
        return circle;
    }

    public void setCircle(String circle) {
        this.circle = circle;
    }
}
