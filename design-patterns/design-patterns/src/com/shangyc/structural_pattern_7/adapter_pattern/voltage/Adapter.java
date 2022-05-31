package com.shangyc.structural_pattern_7.adapter_pattern.voltage;


public class Adapter implements Voltage {

    private HighVoltage highVoltage;

    public Adapter(HighVoltage highVoltage){
        this.highVoltage = highVoltage;
    }

    @Override
    public void charge() {
        highVoltage.charge();
        System.out.println("转化为5V");
    }
}


