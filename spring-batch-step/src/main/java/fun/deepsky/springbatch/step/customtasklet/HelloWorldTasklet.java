package fun.deepsky.springbatch.step.customtasklet;

import java.util.Map;

import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloWorldTasklet implements Tasklet{

	@Override
	public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
		String jobName = chunkContext.getStepContext().getJobName();
		System.out.println("Execute job :" + jobName +".");
		JobParameters jobParameters = chunkContext.getStepContext().getStepExecution().getJobParameters();
		System.out.println("JobParameters:" + jobParameterToString(jobParameters));
		return RepeatStatus.FINISHED;
	}
	
	private String jobParameterToString(JobParameters jobParameters){
		StringBuffer sb = new StringBuffer();
		for(Map.Entry<String, JobParameter> param : jobParameters.getParameters().entrySet()) {
			sb.append(String.format(
				"%s = %s (%s);",
				param.getKey(),param.getValue().getValue(),param.getValue().getType()
			));
		}
		return sb.toString();
	}

}
