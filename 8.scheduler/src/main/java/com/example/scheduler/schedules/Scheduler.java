package com.example.scheduler.schedules;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Scheduled(fixedDelay = 10000)
    //@Scheduled(fixedDelayString = "10000")
    public void testSchedule(){
        System.out.println("Hello there");
    }

    @Scheduled(fixedRate = 1000)
    //@Schedule(fixedRateString="1000")
    public void testSchedule2(){
        System.out.println("Hello there");
    }

    @Scheduled(fixedDelay = 1000)
    @Scheduled(initialDelay = 100)
    public void initDelay(){
        System.out.println("Hello There");
    }

    @Scheduled(cron = "15 * * * * *")
    public void cron15second(){
        System.out.println("Hello There");
    }
}
