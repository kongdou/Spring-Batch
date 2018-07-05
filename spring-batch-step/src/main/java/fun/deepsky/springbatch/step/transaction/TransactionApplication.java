package fun.deepsky.springbatch.step.transaction;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("job-step-transaction.xml");
		JobLauncher launcher =  (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("transactionPolicyJob");
		try {
			JobExecution result = launcher.run(job, new JobParametersBuilder().addDate("date",new Date()).toJobParameters());
			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	
	}
}
