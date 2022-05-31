package com.shangyc.simple;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Component
public class NormalTask {
    private DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "0 27,29 22 13 5 *")
    // @Scheduled(fixedDelay = 2000)
    // @Scheduled(initialDelay = 1000,fixedDelay = 2000)
    /**
     * 通过@Scheduled注解来标注一个定时任务，其中fixedDelay=1000表示在当前任务执行结束一秒后开启另一个任务，
     * fixedRate=2000表示在当前任务开始执行2秒后开启另一个定时任务，initialDelay=1000则表示首次执行的延迟时间。
     * 在@Scheduled注解中可以使用cron表达式，cron = "0 * * * * ?"表示该定时任务每分钟执行一次。
     * ————————————————
     * 版权声明：本文为CSDN博主「monkey_wei」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/monkey_wei/article/details/109752221
     */
    public void robReceiveExpireTask() {
        // System.out.println(df.format(LocalDateTime.now()) + "今天是个好日子");
        System.out.println("今天是个好日子");
    }
}
