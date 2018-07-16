package fun.deepsky.springbatch.flow.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import fun.deepsky.springbatch.flow.Constant;
import fun.deepsky.springbatch.flow.CreditService;

public class VerifyTasklet implements Tasklet{

	private CreditService creditService;
	
	private String outputDirectory;
	
	private String readFileName;
	
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		String status = creditService.verify(outputDirectory, readFileName);
		if(status != null) {
			chunkContext.getStepContext().getStepExecution().getExecutionContext().put(Constant.VERITY_STATUS, status);
		}
		return RepeatStatus.FINISHED;
	}

	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}

	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}

	public void setReadFileName(String readFileName) {
		this.readFileName = readFileName;
	}
	
}
