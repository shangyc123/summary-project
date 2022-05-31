package com.shangyc.behavioral_pattern_11.observer_pattern.many_people_team;

public class Client {


    public static void main(String args[]){

        AllControlCenter team = new ConcreteAllyControlCenter("win team");

        Observer play1 = new Player("p1");
        Observer play2 = new Player("p2");
        Observer play3 = new Player("p3");

        team.join(play1);
        team.join(play2);
        team.join(play3);

        play1.beAttacked(team);
        play2.help();
    }
}
