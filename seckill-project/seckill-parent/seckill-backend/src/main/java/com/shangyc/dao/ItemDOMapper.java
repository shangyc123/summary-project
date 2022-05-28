package com.shangyc.dao;

import com.shangyc.dataobject.ItemDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: shangyc
 * @date: 2022/5/29
 */
public interface ItemDOMapper {

    List<ItemDO> listItem();

    int deleteByPrimaryKey(Integer id);

    int insert(ItemDO record);

    int insertSelective(ItemDO record);

    ItemDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemDO record);

    int updateByPrimaryKey(ItemDO record);

    int increaseSales(@Param("id") Integer id, @Param("amount") Integer amount);
}
