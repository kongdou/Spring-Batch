package fun.deepsky.springbatch.job.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

public class SystemOutAnnotationListener {

	@AfterJob
	public void afterJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("注解拦截器，执行job后...");
	}

	@BeforeJob
	public void beforeJob(JobExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("注解拦截器，执行job前...");
	}
	
}
