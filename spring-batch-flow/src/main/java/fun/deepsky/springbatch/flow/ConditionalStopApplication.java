package fun.deepsky.springbatch.flow;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConditionalStopApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("job-conditional-stop.xml");

		JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");

		Job job = (Job) context.getBean("conditionalStopJob");

		try {
			launcher.run(job, new JobParametersBuilder()
					.addString("inputFile","classpath:/data/credit-card-bill-201310.zip")
					.addString("readFileName","credit-card-bill-201310.csv")
					.addString("workDirectory", "file:target/work/")
					.addString("writeTarget", "file:target/outputFile_end.csv").toJobParameters());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
