package com.shangyc.behavioral_pattern_11.visitor_pattern.employees;

//员工类：抽象元素类
interface Employee {

    //接受一个抽象访问者访问
    public void accept(Department handler);
}
