package com.shangyc.behavioral_pattern_11.iterator_pattern.the_product_through;

import java.util.List;

/**
 * 商品数据类，具体聚合类
 */
public class ProductList extends AbstractObjectList {


    public ProductList(List objects) {
        super(objects);
    }

    //实现创建迭代器对象的具体工厂方法
    @Override
    public Abstractiterator createIterator() {
        return new ProductIterator(this);
    }
}
