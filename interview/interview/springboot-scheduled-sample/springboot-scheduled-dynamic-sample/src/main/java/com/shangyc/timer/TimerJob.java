package com.shangyc.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 我们可以使用java原生提供的api去实现一个定时任务
 *      利用Timer这个api，去实现定时任务，用Timertask去创建一个任务
 */
public class TimerJob {
    public static void main(String[] args) {
        //利用java的api Timer来完成一个定时任务
        Timer timer = new Timer();
        //其实这个技术也是基于java的线程去做的
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                System.out.println("这是一个定时任务");
            }
        };
        timer.schedule(task,0,2000);
    }
}
