package com.shangyc.structural_pattern_7.decorator_pattern;

//构件装饰类：抽象装饰类
public class ComponentDecorator extends Component {
    //维持对抽象构件类型对象的引用
    private Component component;

    public ComponentDecorator(Component component){
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
