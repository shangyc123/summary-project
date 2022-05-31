package com.shangyc.behavioral_pattern_11.visitor_pattern.employees;



//财务部类：具体访问者类
public class FADepartment extends Department {


    //实现财务部对全职员工的访问
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weeklyWage = employee.getWeeklyWage();
        if(workTime > 40){
            weeklyWage = weeklyWage + (workTime - 40) * 100;
        }else if(workTime < 40){
            weeklyWage = weeklyWage - (40 - weeklyWage) * 80;

            if(weeklyWage < 0){
                weeklyWage = 0;
            }
        }
        System.out.println("正式员工" + employee.getName() + "实际工资为：" + weeklyWage + "元。");
    }


    //实现财务部对兼职员工的访问
    @Override
    public void visit(ParttimeEmployee employee) {

        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("临时工" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
    }
}