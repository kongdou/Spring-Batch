package fun.deepsky.springbatch.job.asyn;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AsynJobApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("job-validator.xml");
		JobLauncher launcher =  (JobLauncher) context.getBean("jobLauncherAsyn");
		Job job = (Job) context.getBean("billJob");
		try {
			//JobParametersBuilder中增加必传参数date
			JobExecution result = launcher.run(job, new JobParametersBuilder().addDate("date",new Date()).toJobParameters());
			//使用异步作业启动器，会在调用run方法后立即返回结果，后台异步处理step
			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
