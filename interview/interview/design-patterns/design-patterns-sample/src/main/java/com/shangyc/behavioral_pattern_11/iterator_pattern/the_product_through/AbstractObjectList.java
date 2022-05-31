package com.shangyc.behavioral_pattern_11.iterator_pattern.the_product_through;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象聚合类
 */
public abstract class AbstractObjectList {
    protected List<Object> objects = new ArrayList<>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object o){
        this.objects.add(o);
    }

    public void removeObject(Object o){
        objects.remove(o);
    }

    public List<Object> getObjects() {
        return objects;
    }

    //声明创建迭代器对象的抽象工厂方法
    public abstract Abstractiterator createIterator();
}
