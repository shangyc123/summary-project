package com.shangyc.structural_pattern_7.bridge_pattern;

//抽象图像类：抽象类
public abstract class Image {
    protected ImageImpl impl;
    public void setImageImpl(ImageImpl impl)   {
        this.impl = impl;
    }

    public abstract void parseFile(String fileName);
}
