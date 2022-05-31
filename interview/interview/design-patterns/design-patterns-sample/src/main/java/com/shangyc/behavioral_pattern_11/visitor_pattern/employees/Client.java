package com.shangyc.behavioral_pattern_11.visitor_pattern.employees;

public class Client {


    public static void main(String args[]){

        FulltimeEmployee  fulltimeEmployee1 = new FulltimeEmployee("coco",200,50);
        FulltimeEmployee fulltimeEmployee2 = new FulltimeEmployee("lala",300,30);


        ParttimeEmployee parttimeEmployee1 = new ParttimeEmployee("joo",600,30);
        ParttimeEmployee parttimeEmployee2 = new ParttimeEmployee("ll",300,50);


        EmployeeList employeeList = new EmployeeList();
        employeeList.addEmployee(fulltimeEmployee1);
        employeeList.addEmployee(parttimeEmployee1);
        employeeList.addEmployee(fulltimeEmployee2);
        employeeList.addEmployee(parttimeEmployee2);
        employeeList.accept(new FADepartment());




    }
}
