package com.shangyc.structural_pattern_7.adapter_pattern.voltage;

public class Phone {

    public void charging(Voltage voltage){
        System.out.println("i am phone");
        voltage.charge();
    }
}
