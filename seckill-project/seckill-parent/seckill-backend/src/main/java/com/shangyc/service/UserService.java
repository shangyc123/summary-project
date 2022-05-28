package com.shangyc.service;

import com.shangyc.error.BusinessException;
import com.shangyc.model.UserModel;

/**
 * @author: shangyc
 * @date: 2022/5/28
 */
public interface UserService {

    /***
     * 通过用户ID获取用户对象的方法
     * @param id
     * @return
     */
    UserModel getUserById(Integer id);

    /***
     * 通过缓存获取用户对象
     * @param id
     * @return
     */
    UserModel getUserByIdInCache(Integer id);

    /***
     * 注册
     * @param userModel
     * @throws BusinessException
     */
    void register(UserModel userModel) throws BusinessException;

    /***
     * 验证登录
     * @param telphone 用户注册手机
     * @param encrptPassword 用户加密后的密码
     * @return
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
