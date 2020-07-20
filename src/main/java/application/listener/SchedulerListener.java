package application.listener;

import application.scheduler.CronSchedulerJob;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName SchedulerListener
 * @Description: TODO 定时执行
 * @Author lxc
 * @Date 2020/7/20 22:53
 * @Version V1.0
 **/
@Configuration
@EnableScheduling
@Component
public class SchedulerListener {
    @Autowired public CronSchedulerJob scheduleJobs;

    @Scheduled(cron="0/2 * * * * ?")
    public void schedule() throws SchedulerException {
        scheduleJobs.scheduleJobs();
        System.out.println(">>>>>>>>>>>>>>>定时任务开始执行<<<<<<<<<<<<<");
    }
}
