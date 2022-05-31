package com.shangyc.behavioral_pattern_11.command_pattern.custom_function_keys;

/**
 * 帮助命令类，具体命令类
 */
public class HelpCommond extends Commond {

    //维持对请求接收者的引用
    private HelpHandler helpHandler;

    public HelpCommond(HelpHandler helpHandler) {
        this.helpHandler = helpHandler;
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        this.helpHandler.display();
    }
}
