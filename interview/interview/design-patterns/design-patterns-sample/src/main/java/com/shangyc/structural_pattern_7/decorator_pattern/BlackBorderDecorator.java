package com.shangyc.structural_pattern_7.decorator_pattern;


public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void setBlackBorderDecorator(){
        System.out.println("为构件增加黑色边框！");
    }

    @Override
    public void display() {
        this.setBlackBorderDecorator();
        super.display();
    }
}






