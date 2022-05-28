package com.shangyc.dao;

import com.shangyc.dataobject.UserPasswordDO;

/**
 * @author: shangyc
 * @date: 2022/5/28
 */
public interface UserPasswordDOMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserPasswordDO record);

    int insertSelective(UserPasswordDO record);

    UserPasswordDO selectByPrimaryKey(Integer id);

    UserPasswordDO selectByUserId(Integer userId);

    int updateByPrimaryKeySelective(UserPasswordDO record);

    int updateByPrimaryKey(UserPasswordDO record);
}
