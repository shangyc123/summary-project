package com.shangyc.behavioral_pattern_11.mediator_pattern.the_client_window;

public class Client {


    public static void main(String args[]){
        //定义中介者对象
        ConcrereMediator mediator = new ConcrereMediator();

        //定义同事对象
        Button button = new Button();
        List list = new List();
        TextBox textBox = new TextBox();

        button.setMediator(mediator);
        list.setMediator(mediator);
        textBox.setMediator(mediator);

        mediator.addButton = button;
        mediator.list = list;
        mediator.userNameTextBox = textBox;

        button.change();
        System.out.println("-----------------------------");
        list.change();

    }
}
