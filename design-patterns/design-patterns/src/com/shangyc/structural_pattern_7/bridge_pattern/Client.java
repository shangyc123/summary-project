package com.shangyc.structural_pattern_7.bridge_pattern;


public class Client {
    public static void main(String args[]){
        Image image;
        Image image2;
        ImageImpl imp;
        image = (Image) XMLUtil.getBean("image");
        //相当于创建了一个子类对象
         image2 = new PNGImage();
        imp = (ImageImpl) XMLUtil.getBean("os");
        image.setImageImpl(imp);
        image.parseFile("我老婆小龙女");

        image2.setImageImpl(imp);
        image2.parseFile("我另一个老婆");
    }
}










