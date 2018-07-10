package fun.deepsky.springbatch.writer.router;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompositeClassifyApplication {
	public static void main(String[] args) {
		try {
		ApplicationContext context = new ClassPathXmlApplicationContext("job-writer-composite-classify.xml");
		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("compositeClassifyWriterJob");
		
			launcher.run(job, new JobParametersBuilder().addDate("date", new Date()).toJobParameters());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
