package com.shangyc.behavioral_pattern_11.command_pattern.custom_function_keys;

public class Client {

    public static void main(String args[]){
        FBSettingWindow fbSettingWindow = new FBSettingWindow("windows window");
        FunctionButton functionButton1 = new FunctionButton("minminze window");
        FunctionButton functionButton2 = new FunctionButton("help window");

        Commond commond1 = new MinimizeCommand(new WindowHandlder());
        //WindowHandlder windowHandlder = new WindowHandlder();
        //commond1.execute();

        Commond commond2 = new HelpCommond(new HelpHandler());
        functionButton1.setCommond(commond1);
        functionButton2.setCommond(commond2);

        fbSettingWindow.addFunctionButton(functionButton1);
        fbSettingWindow.addFunctionButton(functionButton2);

        fbSettingWindow.display();
        //commond1.execute();
        functionButton1.click();
    }
}
