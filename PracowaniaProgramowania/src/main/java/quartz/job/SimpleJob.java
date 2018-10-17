package quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

//Simplest job is a class that implements Job interface (execute method)
public class SimpleJob implements org.quartz.Job {

    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        System.out.println("Executing like there is no tomorrow");

        System.out.println(jobExecutionContext.getFireTime());

    }
}