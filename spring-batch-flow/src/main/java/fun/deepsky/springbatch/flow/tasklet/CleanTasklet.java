package fun.deepsky.springbatch.flow.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import fun.deepsky.springbatch.flow.CreditService;

public class CleanTasklet implements Tasklet{

	private CreditService creditService;
	
	private String outputDirectory;
	
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		creditService.clean(outputDirectory);
		return RepeatStatus.FINISHED;
	}

	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}

	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}
	
}
