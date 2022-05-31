package com.shangyc.behavioral_pattern_11.command_pattern.custom_function_keys;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能键设置窗口类
 */
public class FBSettingWindow {
    //窗口标题
    private String title;

    //定义一个ArrayList来存储所有功能键
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton button){
        functionButtons.add(button);
    }

    //显示窗口及功能键
    public void display(){
        functionButtons.forEach(f->{
            System.out.println(f.getName());
        });
    }
}
