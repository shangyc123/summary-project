package com.shangyc.dynamic.core;

import com.shangyc.dynamic.model.ReportAutoCronTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 使用ScheduledTaskRegistrar来注册定时任务,这里主要是用addCronTask这个方法来新增定时任务
 * **
 * public void addCronTask(Runnable task, String expression){}
 * **
 *
 * 可以看到addCronTask上图中需要一个Runnable和一个表达式的参数，这两个参数也是创建一个CronTask的要求，
 * 所以我们首先去创建一个Runnable，代码中是我自己创建的一些业务可以忽略，主要的方法就是一个run方法
 */


@Component
public class ReportAutoRunnable implements Runnable {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReportAutoRunnable.class);


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            // LOGGER.info("定时任务开始执行 任务id：{} ,线程名称：{}", reportAutoCronTask.getTaskId(),name);
            // reportAutoService.autoReport(reportAutoCronTask);
            System.out.println("任务开始");
            // LOGGER.info("定时任务执行完毕 任务id：{} ,线程名称：{}", reportAutoCronTask.getTaskId(),name);
        } catch (Exception ex) {
            // LOGGER.info("定时任务执行出现异常 任务id：{} ,异常信息：{}", reportAutoCronTask.getTaskId(),ex.getMessage());
        }
    }
}

