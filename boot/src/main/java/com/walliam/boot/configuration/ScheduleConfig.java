package com.walliam.boot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

/**
 * 由于定时任务都是单线程再跑，所以需要设置为多线程
 * 有两种方式，
 *  第一种在 1、启动类开始异步模式，加入注解：@EnableAsync   2、定时方法前加入注解@Async
 *  第二种、注册定时任务配置 通过实现SchedulingConfigurer接口，重写configureTasks方法，重新定义线程池
 */
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        // 开启一个固定10个大小的线程池，也使用Executors下其他的线程池
        scheduledTaskRegistrar.setScheduler(Executors.newScheduledThreadPool(10));
    }
}
