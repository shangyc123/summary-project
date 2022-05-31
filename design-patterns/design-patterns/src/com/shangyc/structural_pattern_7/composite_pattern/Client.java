package com.shangyc.structural_pattern_7.composite_pattern;

public class Client {
    public static void main(String args[]){
        //针对抽象构件编程
        //面向接口编程，不是面向实现编程
        AbstractFile file1,file2,folder1,folder2;

        folder1 = new Folder("我的文件夹");
        folder2 = new Folder("图像文件夹");


        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");

        folder1.add(file1);
        folder2.add(file2);

        folder1.add(folder2);

        folder1.killVirus();
    }
}
