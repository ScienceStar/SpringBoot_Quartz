package application.runner;

import application.scheduler.CronSchedulerJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @ClassName MyStartupRunner
 * @Description: TODO 项目启动时执行方式
 * @Author lxc
 * @Date 2020/7/20 22:49
 * @Version V1.0
 **/
//@Component
public class MyStartupRunner implements CommandLineRunner {

    @Autowired
    public CronSchedulerJob scheduleJobs;

    @Override
    public void run(String... args) throws Exception {
        scheduleJobs.scheduleJobs();
        System.out.println(">>>>>>>>>>>>>>>定时任务开始执行<<<<<<<<<<<<<");
    }
}
