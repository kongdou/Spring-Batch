package fun.deepsky.springbatch.job.scheduler;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;

public class SchedulerLauncher {

	private Job job;
	private JobLauncher jobLauncher;
	
	public void launcher() throws Exception {
		JobParameters jobParams = new JobParametersBuilder().addDate("executeDate", new Date()).toJobParameters();
		jobLauncher.run(job, jobParams);
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public JobLauncher getJobLauncher() {
		return jobLauncher;
	}

	public void setJobLauncher(JobLauncher jobLauncher) {
		this.jobLauncher = jobLauncher;
	}
	
	
	
	
}
