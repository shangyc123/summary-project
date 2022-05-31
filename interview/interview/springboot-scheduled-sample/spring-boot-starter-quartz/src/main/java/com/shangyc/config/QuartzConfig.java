package com.shangyc.config;

import com.shangyc.job.Myquartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//这个类主要是做配置类去配置JobDetail，Trigger即配置工作明细，和触发器，

/**
 * JobDetail的配置有两种方式：
 * 第一种方式通过MethodInvokingJobDetailFactoryBean类配置JobDetail，只需要指定Job的实例名和要调用的方法即可，注册这种方式无法在创建JobDetail时传递参数；
 * 第二种方式是通过JobDetailFactoryBean来实现的，这种方式只需要指定JobClass即可，然后可以通过JobDataMap传递参数到Job中，Job中只需要提供属性名，并且提供一个相应的set方法即可接收到参数。
 *
 * Trigger有多种不同的实现，这里展示两种常用的Trigger：SimpleTrigger和CronTrigger，这两种Trigger分别使用SimpleTriggerFactoryBean和CronTriggerFactoryBean进行创建。
 * 在SimpleTriggerFactoryBean对象中，首先设置JobDetail，然后通过setRepeatCount配置任务循环次数，setStartDelay配置任务启动延迟时间，setRepeatInterval配置任务的时间间隔。在CronTriggerFactoryBean对象中，则主要配置JobDetail和Cron表达式。
 * 最后通过SchedulerFactoryBean创建SchedulerFactory，然后配置Trigger即可。
 * ————————————————
 * 版权声明：本文为CSDN博主「monkey_wei」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/monkey_wei/article/details/109752221
 */
@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail jobDetail(){
        //在这里工作明细要绑定一个job
        //现在这个工作就完成了这里必须要加上storeDurably,这个作用是当这个任务没有被执行也会一直存在保持持久化

        return JobBuilder.newJob(Myquartz.class).storeDurably().build();

    }
    @Bean
    public Trigger trigger(){


//        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
//                .withIntervalInSeconds(10)  //设置时间周期单位秒
//                .repeatForever();
//        return TriggerBuilder.newTrigger().forJob(jobDetail())
//
//                .withIdentity("testQuartz")
//                .withSchedule(scheduleBuilder)
//                .build();


        //这里触发器要绑定一个工作明细JobDetail 同时要完成调度
        //这里要说明一下withSchedule是完成调度的下面这行代码是实现时间调度的要
        //要说明一下0 0 0 0 0 0，分别代表 秒 分 时 日 月 星期 其中日 和星期会有冲突通常我们都只配一个 另一个用？代替
        //ScheduleBuilder<? extends Trigger> schdule=CronScheduleBuilder.cronSchedule("0 0 0 0 0 0") ;
        //如CronScheduleBuilder.cronSchedule("0 0 0 1 2 ？")这就代表了2月的第一天0秒0分0时 我们还可以配*代表任意 ;
        //还可以如CronScheduleBuilder.cronSchedule("0/15 * * * * ？")代表没个15秒执行一次
        ScheduleBuilder schdule= CronScheduleBuilder.cronSchedule("0/5 * * * * ?") ;
        //forJob就时绑定工作明细
        return TriggerBuilder.newTrigger().forJob(jobDetail()).withSchedule(schdule).build();
    }

    /**
     *
     * 你要想在springboot中整合这个技术，我们首先来了解几个词
     *
     * >工作(job)：用于执行具体的任务
     *
     * >工作明细（jobDetail）：用于定义定时工作的信息
     *
     * >触发器（Trigger）：用于描述触发工作的规则，和定义调度通常用Cron来进行定义调度的规则
     *
     * >调度（scheduler）：用于描述工作明细和触发器之间的关系
     * ————————————————
     * 版权声明：本文为CSDN博主「code-king」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/weixin_52652310/article/details/124038601
     *
     */

}
