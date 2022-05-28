package com.shangyc.dao;

import com.shangyc.dataobject.StockLogDO;

/**
 * @author: shangyc
 * @date: 2022/5/29
 */
public interface StockLogDOMapper {

    int deleteByPrimaryKey(String stockLogId);

    int insert(StockLogDO record);

    int insertSelective(StockLogDO record);

    StockLogDO selectByPrimaryKey(String stockLogId);

    int updateByPrimaryKeySelective(StockLogDO record);

    int updateByPrimaryKey(StockLogDO record);
}
