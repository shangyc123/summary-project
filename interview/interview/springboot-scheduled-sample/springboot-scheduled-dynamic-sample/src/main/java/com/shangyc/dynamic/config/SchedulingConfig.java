package com.shangyc.dynamic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * 初始化  定时任务的线程池的大小和名称   等信息
 */
// 开启定时任务
@EnableScheduling
@Configuration
public class SchedulingConfig {

    @Bean
    public TaskScheduler taskScheduler() {
        // 创建任务调度线程池
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        // 初始化线程池数量
        taskScheduler.setPoolSize(4);
        // 是否将取消后的任务，从队列中删除
        taskScheduler.setRemoveOnCancelPolicy(true);
        // 设置线程名前缀
        taskScheduler.setThreadNamePrefix("TaskSchedulerThreadPool-");
        return taskScheduler;
    }
}

