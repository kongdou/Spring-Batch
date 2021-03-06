package fun.deepsky.springbatch.reader.procedure;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProcedureApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("job-reader-procedure.xml");
		
		JobLauncher launcher = (JobLauncher) applicationContext.getBean("jobLauncher");
		Job job = (Job) applicationContext.getBean("procedureReadJob");
		
		try {
			launcher.run(job, new JobParametersBuilder().addDate("date",new Date()).toJobParameters());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}
}
