package com.shangyc.dao;

import com.shangyc.dataobject.UserDO;

/**
 * @author: shangyc
 * @date: 2022/5/28
 */
public interface UserDOMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Integer id);

    UserDO selectByTelphone(String telphone);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}
