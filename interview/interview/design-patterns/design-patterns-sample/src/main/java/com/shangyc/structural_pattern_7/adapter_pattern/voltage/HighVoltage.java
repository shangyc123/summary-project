package com.shangyc.structural_pattern_7.adapter_pattern.voltage;

public class HighVoltage implements Voltage {

    private  final int num = 220;
    @Override
    public void charge() {
        System.out.println("我的电压是" + num);
    }

}
