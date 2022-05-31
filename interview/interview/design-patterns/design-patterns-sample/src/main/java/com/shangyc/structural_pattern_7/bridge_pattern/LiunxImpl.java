package com.shangyc.structural_pattern_7.bridge_pattern;

//Linux操作系统实现类：具体实现类
public class LiunxImpl implements ImageImpl{
    public void doPaint(Matrix m){
        System.out.println("在Linux操作系统中显示图像");
    }
}
