package com.shangyc.structural_pattern_7.decorator_pattern;

public class Client {
    public static void  main(String args[]){
        //使用抽象构件定义
        Component component,componentSB,componentSBB;
        //定义具体构件
        component = new Window();
        //定义装饰后的构件
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();

        //将装饰了一次之后的对象继续注入 到另一个装饰类中，进行第二次装饰
        componentSBB  = new BlackBorderDecorator(componentSB);
        componentSBB.display();


    }

}
