package com.shangyc.creation_pattern_6.the_singleton_pattern.car_singleton;


public class MyCar {

    //饿汉模式
    private static MyCar myCar = new MyCar();

    //构造器私有化
    private MyCar(){}

    public static MyCar getInstance(){
        return myCar;
    }

    public void  run(){
        System.out.println(myCar.toString());
    }
}