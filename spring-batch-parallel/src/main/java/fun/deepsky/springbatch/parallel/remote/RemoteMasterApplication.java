package fun.deepsky.springbatch.parallel.remote;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RemoteMasterApplication {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("job-remote-master.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		
		Job job = (Job) context.getBean("masterChunkJob");
		
		try {
			launcher.run(job, new JobParametersBuilder().addDate("date",new Date()).toJobParameters());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


}
