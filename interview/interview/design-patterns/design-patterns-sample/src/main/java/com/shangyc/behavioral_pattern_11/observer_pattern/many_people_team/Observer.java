package com.shangyc.behavioral_pattern_11.observer_pattern.many_people_team;


//抽象观察类
interface  Observer {

    public String getName();

    public void setName(String name);

    //声明支援盟友方法
    void help();
    //声明遭受攻击方法
    public void beAttacked(AllControlCenter acc);

}
