package com.shangyc.behavioral_pattern_11.iterator_pattern.the_product_through;

/**
 * 抽象迭代器
 */
public abstract class Abstractiterator {

    public abstract void next();
    public abstract boolean isLast();

    public abstract void previous();

    public abstract boolean isFirst();

    public abstract Object getNextItem();

    public abstract Object getPreviousItem();
}
