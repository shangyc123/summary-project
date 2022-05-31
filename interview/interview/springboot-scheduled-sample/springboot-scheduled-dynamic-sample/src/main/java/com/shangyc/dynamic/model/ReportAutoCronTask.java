package com.shangyc.dynamic.model;

import org.springframework.scheduling.config.CronTask;
import org.springframework.scheduling.support.CronTrigger;

/**
 * 创建完Runnable后可以创建一个CronTask，我是继承了一下CronTask类增加了两个属性一个id，一个名称
 */
public class ReportAutoCronTask extends CronTask {
    /**
     * 任务id
     */
    private String taskId;

    /**
     * 任务名称
     */
    private String taskName;


    public ReportAutoCronTask(Runnable runnable, String expression) {
        super(runnable, expression);
    }

    public ReportAutoCronTask(Runnable runnable, CronTrigger cronTrigger) {
        super(runnable, cronTrigger);
    }

    public ReportAutoCronTask(Runnable runnable, String expression,String taskId,String taskName){
        super(runnable, expression);
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}

