package com.shangyc.structural_pattern_7.proxy_pattern.car_proxy;

public class ICarImpl implements ICar {
    @Override
    public void makeCar() {
        System.out.println("i make a car");
    }
}
