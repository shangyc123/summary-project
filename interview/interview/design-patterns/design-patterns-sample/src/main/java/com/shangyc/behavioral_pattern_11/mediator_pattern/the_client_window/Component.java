package com.shangyc.behavioral_pattern_11.mediator_pattern.the_client_window;


/**
 * 抽象组件类：抽象同事类
 */
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    //转发调用
    public void change(){
        mediator.componentChanged(this);
    }



    public abstract  void update();
}
