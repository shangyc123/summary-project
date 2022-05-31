package com.shangyc.creation_pattern_6.the_singleton_pattern.car_singleton;

public class MyCar2 {

    //懒汉模式
    private static MyCar2 myCar2;

    private MyCar2(){}

    private static synchronized MyCar2 getInstance(){
        if(null == myCar2){
            return new MyCar2();
        }else {
            return myCar2;
        }
    }
}
