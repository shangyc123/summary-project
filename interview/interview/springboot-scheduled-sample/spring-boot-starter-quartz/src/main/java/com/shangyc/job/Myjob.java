package com.shangyc.job;


import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Myjob {
    public void sayHello(){
        System.out.println("MyFirstJob:sayHello:"+new Date());
    }
}
