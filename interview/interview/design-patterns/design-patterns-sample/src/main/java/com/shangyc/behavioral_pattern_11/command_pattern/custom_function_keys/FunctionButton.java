package com.shangyc.behavioral_pattern_11.command_pattern.custom_function_keys;

/**
 * 功能键类，请求发送者
 */
public class FunctionButton {

    //维持一个抽象命令对象的引用
    private Commond commond;
    //功能键名称
    private String name;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //为功能键注入命令
    public void setCommond(Commond commond) {
        this.commond = commond;
    }
    //发送请求的方法
    public void click(){
        System.out.print("点击功能键：");
        commond.execute();
    }
}
