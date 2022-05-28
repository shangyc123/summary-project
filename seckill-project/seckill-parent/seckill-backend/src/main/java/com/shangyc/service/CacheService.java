package com.shangyc.service;

import com.shangyc.model.ItemModel;

/**
 * @author: shangyc
 * @date: 2022/5/29
 */
public interface CacheService {

    /***
     * 存值方法
     * @param key
     * @param value
     */
    void setCommonCache(String key, Object value);

    /***
     * 取值方法
     * @param key
     * @return
     */
    Object getFromCommonCache(String key);
}
