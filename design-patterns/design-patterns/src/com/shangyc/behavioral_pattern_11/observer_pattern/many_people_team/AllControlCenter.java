package com.shangyc.behavioral_pattern_11.observer_pattern.many_people_team;

import java.util.ArrayList;

//战队控制中心类：目标类
public abstract class AllControlCenter {
    //战队名称
    protected String allyName;
    //定义一个集合用于存储战队成员
    protected ArrayList<Observer> players = new ArrayList<>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
    //注册方法
    public  void join(Observer obs){
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    //注销方法
    public  void quit(Observer obs){
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    public abstract void notifyObserver(String name);
}