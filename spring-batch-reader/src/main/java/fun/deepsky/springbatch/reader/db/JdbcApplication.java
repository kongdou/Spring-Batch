package fun.deepsky.springbatch.reader.db;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("job-reader-jdbc.xml");
		
		JobLauncher launcher = (JobLauncher) applicationContext.getBean("jobLauncher");
		Job job = (Job) applicationContext.getBean("dbReadJob");
		
		try {
			launcher.run(job, new JobParametersBuilder().addDate("date",new Date()).addString("id", "6").toJobParameters());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
