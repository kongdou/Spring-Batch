package fun.deepsky.springbatch.reader.hibernate;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HibernateApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("job-reader-hibernate-paging.xml");
		
		JobLauncher launcher = (JobLauncher) applicationContext.getBean("jobLauncher");
		Job job = (Job) applicationContext.getBean("hibernatePageReadJob");
		
		try {
			launcher.run(job, new JobParametersBuilder().addDate("date",new Date()).addString("begin","1").addString("end","5").toJobParameters());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
	}
}
