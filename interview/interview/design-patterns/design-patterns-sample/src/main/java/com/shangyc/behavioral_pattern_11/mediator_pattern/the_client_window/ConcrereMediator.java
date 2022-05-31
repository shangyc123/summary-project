package com.shangyc.behavioral_pattern_11.mediator_pattern.the_client_window;

/**
 * 具体中介者
 */
public class ConcrereMediator extends Mediator {

    //维持对各个同事对象的引用
    public Button addButton;
    public List list;

    public TextBox userNameTextBox;

    @Override
    public void componentChanged(Component component) {

        //单击按钮
        if(component == addButton){
            System.out.println("--单击增加按钮--");
            list.update();
            userNameTextBox.update();
        }
        //从列表框选择客户
        else if(component == list){
            System.out.println("--从列表框选择客户--");
            userNameTextBox.setText();
        }
    }
}