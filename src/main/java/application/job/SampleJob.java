package application.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @ClassName SampleJob
 * @Description: TODO
 * @Author lxc
 * @Date 2020/7/20 22:38
 * @Version V1.0
 **/
public class SampleJob extends QuartzJobBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Quartz ---->  Hello, 2s" + this.name);
    }
}
