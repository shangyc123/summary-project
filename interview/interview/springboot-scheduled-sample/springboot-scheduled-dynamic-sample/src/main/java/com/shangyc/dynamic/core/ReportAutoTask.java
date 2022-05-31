package com.shangyc.dynamic.core;

import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *查找代码可以看见sringbot中有相关的定时任务注册类，需要实现SchedulingConfigurer 类来进行注册定时任务，
 * configureTasks在项目初始化的时候会进行执行然后通ScheduledTaskRegistrar 用来注册定时任务，
 * 这里想进行动态的增加不太现实，我们可以对这个类做一个改变使我们可以在项目启动之后获取到ScheduledTaskRegistrar这个类
 * ————————————————
 * 版权声明：本文为CSDN博主「鹏举在努力」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/weixin_43947145/article/details/123089507
 *
 */
@Component
public class ReportAutoTask implements SchedulingConfigurer {

    private ScheduledTaskRegistrar scheduledTaskRegistrar;

    /**
     * 根据taskId来储存指定的任务
     */
    private Map<String, ScheduledTask> scheduledTaskMap = new ConcurrentHashMap<>(16);

    /**
     * 定时任务注册(这个方法会在启动的时候进行执行)
     *
     * @param scheduledTaskRegistrar
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        this.scheduledTaskRegistrar = scheduledTaskRegistrar;
    }

    public ScheduledTaskRegistrar getScheduledTaskRegistrar() {
        return scheduledTaskRegistrar;
    }

    public void setScheduledTaskRegistrar(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        this.scheduledTaskRegistrar = scheduledTaskRegistrar;
    }

    public Map<String, ScheduledTask> getScheduledTaskMap() {
        return scheduledTaskMap;
    }

    public void setScheduledTaskMap(Map<String, ScheduledTask> scheduledTaskMap) {
        this.scheduledTaskMap = scheduledTaskMap;
    }
}

