package com.shangyc.behavioral_pattern_11.observer_pattern.many_people_team;


//战队成员类：具体观察者类
public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    //支援盟友方法的实现
    @Override
    public void help() {
        System.out.println("hold on " + name + "will help you ");
    }

    //遭受攻击方法的实现，当遭受攻击时将调用战队控制中心类的通知方法notifyObserver()来通知盟友
    @Override
    public void beAttacked(AllControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);
    }
}

