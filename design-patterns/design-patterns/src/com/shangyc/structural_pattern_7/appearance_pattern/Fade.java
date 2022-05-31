package com.shangyc.structural_pattern_7.appearance_pattern;

public class Fade {
    private ClassOne one;

    private ClassTwo classTwo;

    private ClassThree classThree;


    public Fade(ClassOne one, ClassTwo classTwo, ClassThree classThree) {
        this.one = one;
        this.classTwo = classTwo;
        this.classThree = classThree;
    }


    public void runMehod1(){
        one.domethod();
        classThree.domethod();
    }



    public void runMehod2(){
        one.domethod();
        classTwo.domethod();
        classThree.domethod();
    }

}
