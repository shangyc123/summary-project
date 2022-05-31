package com.shangyc.dynamic.core;

import com.shangyc.dynamic.model.ReportAutoCronTask;
import org.springframework.scheduling.config.ScheduledTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.Map;

public class Client {
    public static void main(String[] args) {

    }

    /**
     * 注册并启动定时任务
     */
    public void registAndStart() {
        // 每30秒执行一次
        String expression ="0/30 0 0 * ?";

        ReportAutoRunnable reportAutoRunnable = new ReportAutoRunnable();
        // 创建定时任务
        ReportAutoCronTask reportAutoCronTask = new ReportAutoCronTask(reportAutoRunnable, expression, "1111", "任务名称");
        ReportAutoTask reportAutoTask = new ReportAutoTask();
        ScheduledTaskRegistrar scheduledTaskRegistrar = reportAutoTask.getScheduledTaskRegistrar();
        Map<String, ScheduledTask> scheduledTaskMap = reportAutoTask.getScheduledTaskMap();
        scheduledTaskRegistrar.addCronTask(reportAutoCronTask);
        // 启动定时任务
        ScheduledTask scheduledTask = scheduledTaskRegistrar.scheduleCronTask(reportAutoCronTask);
        // reportAutoCronTask.setFlag(true);
        scheduledTaskMap.put("1111", scheduledTask);
    }

    public void shutdown() {
        ReportAutoTask reportAutoTask = new ReportAutoTask();
        Map<String, ScheduledTask> scheduledTaskMap = reportAutoTask.getScheduledTaskMap();
        for (Map.Entry<String, ScheduledTask> scheduledTaskEntry : scheduledTaskMap.entrySet()) {
            if (scheduledTaskEntry.getKey().equals(new ReportAutoCronTask(new ReportAutoRunnable(), "0/30 0 0 * ?", "1111", "任务名称").getTaskId())) {
                // 停止定时任务
                scheduledTaskEntry.getValue().cancel();
            }
        }

    }
}
