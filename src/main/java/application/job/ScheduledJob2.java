package application.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName ScheduledJob2
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/20 22:45
 * @Version V1.0
 **/
public class ScheduledJob2 implements Job {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("CRON ----> schedule job2 is running ... + " + name + "  ---->  " + dateFormat.format(new Date()));
    }
}
