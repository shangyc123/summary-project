package com.shangyc.structural_pattern_7.adapter_pattern.voltage;

public class AdapterTest {

    public static void main(String[] args) {
        Phone phone = new Phone();
        //高电压
        HighVoltage highVoltage = new HighVoltage();
        //将高电压转换为低电压
        Adapter adapter = new Adapter(highVoltage);
        //在低电压上冲或变压器上充电
        phone.charging(adapter);
    }
}
