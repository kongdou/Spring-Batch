package fun.deepsky.springbatch.job.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class SystemOutJobExecutionListener implements JobExecutionListener{

	@Override
	public void afterJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("执行job后...");
	}

	@Override
	public void beforeJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("执行job前...");
	}

}
