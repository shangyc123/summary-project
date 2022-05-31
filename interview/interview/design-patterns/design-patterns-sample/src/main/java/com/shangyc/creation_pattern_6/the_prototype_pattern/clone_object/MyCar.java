package com.shangyc.creation_pattern_6.the_prototype_pattern.clone_object;


public class MyCar implements Cloneable{

    //饿汉模式
    private static MyCar myCar = new MyCar();

    //构造器私有化
    private MyCar(){}

    public static MyCar getInstance(){
        return myCar;
    }

    public void  run() throws CloneNotSupportedException {
        Object clone = super.clone();
        System.out.println(myCar.toString());
        System.out.println(clone.toString());
    }
}
