package application.scheduler;

import application.job.SampleJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SampleScheduler
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/20 22:40
 * @Version V1.0
 **/
//@Configuration
public class SampleScheduler {
    @Bean
    public JobDetail sampleJobDetail() {
        // 链式编程,可以携带多个参数,在Job类中声明属性 + setter方法
        return JobBuilder.newJob(SampleJob.class).withIdentity("sampleJob")
                .usingJobData("name","World").storeDurably().build();
    }

    @Bean
    public Trigger sampleJobTrigger(){
        // 每隔两秒执行一次
        SimpleScheduleBuilder scheduleBuilder =
                SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever();
        return TriggerBuilder.newTrigger().forJob(sampleJobDetail()).withIdentity("sampleTrigger")
                .withSchedule(scheduleBuilder).build();
    }
}
