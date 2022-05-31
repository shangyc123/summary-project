package com.shangyc.structural_pattern_7.flyweight_pattern;

public class Client {
    public static void main(String args[]){

        IgoChessman black1,black2,white1,white2;

        IgoChessmanFactory factory;

        //获取享元工厂对象
        factory = IgoChessmanFactory.getInstance();


        //通过享元工厂获取三颗黑子
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");

        System.out.println("判断两颗黑子是否相同：" + (black1==black2));

        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");

        System.out.println("判断两颗白子是否相同：" + (white1==white2));

        black1.display(new Coordinates(2,9));

        white1.display(new Coordinates(6,9));


    }
}
