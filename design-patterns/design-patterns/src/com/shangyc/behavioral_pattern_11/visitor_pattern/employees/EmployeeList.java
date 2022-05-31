package com.shangyc.behavioral_pattern_11.visitor_pattern.employees;


import java.util.ArrayList;
import java.util.List;

//员工列表类：对象结构
public class EmployeeList {

    //定义一个集合用于存储员工对象
    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee){
        list.add(employee);
    }

    //遍历访问员工集合中的每一个员工对象
    public void accept(Department handler){
        list.forEach(l->{
            l.accept(handler);
        });
    }
}