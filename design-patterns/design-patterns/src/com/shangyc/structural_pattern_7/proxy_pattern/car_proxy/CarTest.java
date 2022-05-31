package com.shangyc.structural_pattern_7.proxy_pattern.car_proxy;

public class CarTest {
    public static void main(String[] args) {
        CarProxy carProxy = new CarProxy(new ICarImpl());
        carProxy.makeCar();
    }
}
