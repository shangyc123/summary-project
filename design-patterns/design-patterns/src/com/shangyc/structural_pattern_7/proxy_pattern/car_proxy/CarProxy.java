package com.shangyc.structural_pattern_7.proxy_pattern.car_proxy;


public class CarProxy implements ICar {

    private ICarImpl iCar;

    public CarProxy(ICarImpl iCar){
        this.iCar  = iCar;
    }

    @Override
    public void makeCar() {
        iCar.makeCar();
    }
}



