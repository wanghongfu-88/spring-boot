package com.walliam.boot.sechedul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务开启
 * 1、启动类添加@EnableSchedule
 * 2、定时任务添加@Schedule
 * 3、由于定时程序默认都是单线程再跑，所以在执行方
 *  第一、1、启动类开始异步模式，加入注解：@EnableAsync   2、定时方法前加入注解@Async
 *  第二、注册定时任务配置 通过实现SchedulingConfigurer接口，重写configureTasks方法，重新定义线程池
 *
 *
 */
@Component
@Slf4j
public class Task1 {
    /**
     * fixedDelay 固定延迟
     * fixedRate 固定频率
     * initialDelay 初始延迟
     */
    @Async
    @Scheduled(cron = "0/10 * * * * ?")
    public void task1(){
       log.info("定时任务开始--test1--------------------------------------------------------");
    }
    @Async
    @Scheduled(cron = "0/10 * * * * ?")
    public void task4(){
        log.info("定时任务开始--test4--------------------------------------------------------");
    }
    @Async
    @Scheduled(initialDelay = 1000,fixedDelay = 10000)
    public void task2(){
        log.warn("定时任务开始--test2--------------------------------------------------------");
    }

    @Async
    @Scheduled(initialDelay = 1000,fixedDelay = 10000)
    public void task3(){
        log.warn("定时任务开始--test3--------------------------------------------------------");
    }
}
