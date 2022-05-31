package com.shangyc.structural_pattern_7.composite_pattern;

import java.util.ArrayList;

//文件夹类：容器构件
public class Folder extends AbstractFile{

    private String name;
    //定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void move(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");
        //递归调用成员构件的killVirus()方法
        fileList.forEach(f->f.killVirus());
    }
}
