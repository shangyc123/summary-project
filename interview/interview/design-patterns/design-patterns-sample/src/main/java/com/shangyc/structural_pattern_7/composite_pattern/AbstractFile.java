package com.shangyc.structural_pattern_7.composite_pattern;

//抽象文件类：抽象构件
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void move(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}







