package fun.deepsky.batch.robust.restart;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestartApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("job-robust-restart.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		
		Job job = (Job) context.getBean("restartJob");
		
		try {
			launcher.run(job, new JobParametersBuilder().toJobParameters());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
