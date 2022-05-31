package com.shangyc.behavioral_pattern_11.iterator_pattern.the_product_through;

import java.util.ArrayList;
import java.util.List;

public class Client {


    public static void  main (String args[]){

        List<String> productCollcet = new ArrayList<>();
        productCollcet.add("product A ");

        productCollcet.add("product B ");
        productCollcet.add("product C ");
        productCollcet.add("product D ");

        //创建聚合对象
        AbstractObjectList productList = new ProductList(productCollcet);

        //创建迭代器对象
        Abstractiterator iterator = productList.createIterator();
        //ProductIterator productIterator = new ProductIterator(productList);

        //System.out.println(productIterator.);

        System.out.println("正向遍历：");
        while (!iterator.isLast()){
            System.out.print(iterator.getNextItem() + "，");
            iterator.next();
        }

        System.out.println();
        System.out.println("逆向遍历：");

        while (!iterator.isFirst()){
            System.out.print(iterator.getPreviousItem() + "，");
            iterator.previous();
        }
    }
}
