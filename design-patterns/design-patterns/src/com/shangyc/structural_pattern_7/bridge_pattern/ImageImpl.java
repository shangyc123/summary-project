package com.shangyc.structural_pattern_7.bridge_pattern;

//抽象操作系统实现类：实现类接口
public interface ImageImpl {
    //显示像素矩阵m
    public void doPaint(Matrix m);
}
