package com.shangyc.behavioral_pattern_11.observer_pattern.many_people_team;

public class ConcreteAllyControlCenter extends AllControlCenter {

    public ConcreteAllyControlCenter(String name) {

        System.out.println(name + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = name;
    }

    //实现通知方法
    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");

        //遍历观察者集合，调用每一个盟友（自己除外）的支援方法
        players.forEach(p->{
            if(name != p.getName()){
                p.help();
            }
        });
    }
}
