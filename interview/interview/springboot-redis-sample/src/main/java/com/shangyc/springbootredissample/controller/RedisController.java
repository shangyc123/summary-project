package com.shangyc.springbootredissample.controller;

import com.shangyc.springbootredissample.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName：TestController
 * @Description：Redis控制器
 * @Author：chenyb
 * @Date：2020/8/17 12:07 上午
 * @Versiion：1.0
 */
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("setAndGet/{k}/{v}")
    public String test(@PathVariable("k") String k, @PathVariable("v") String v){
        redisUtils.set(k,v);
        return (String) redisUtils.get(k);
    }
    @RequestMapping("get/{k}")
    public String test(@PathVariable("k") String k){
        //step1 先从redis中取
        String strJson=(String) redisUtils.get(k);
        return strJson;
    }


}
