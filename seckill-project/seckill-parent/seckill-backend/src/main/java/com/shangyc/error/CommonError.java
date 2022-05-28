package com.shangyc.error;

/**
 * 通用错误封装
 * 
 * @author: shangyc
 * @date: 2022/5/28
 */
interface CommonError {
    int getErrCode();
    String getErrMsg();
    CommonError setErrMsg(String errMsg);
}
