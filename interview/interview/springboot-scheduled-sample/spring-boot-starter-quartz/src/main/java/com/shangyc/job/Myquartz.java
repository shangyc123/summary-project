package com.shangyc.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 这里我们不需要做Quarze的配置，我们要做的是去继承一个quarze的一个抽象类QuartzJobBean，
 * 代表这个是一个Job然后是实现这个抽象类中的方法就是我们具体的工作
 */
public class Myquartz extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("hhhh我是quartz");
    }
}
