package com.shangyc.structural_pattern_7.decorator_pattern;

//滚动条装饰类：具体装饰类
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display(){
        this.setScrollbar();
        super.display();
    }

    public void setScrollbar(){
        System.out.println("为构件增加滚动条！");
    }
}
