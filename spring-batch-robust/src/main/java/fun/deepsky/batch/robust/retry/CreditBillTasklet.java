package fun.deepsky.batch.robust.retry;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.retry.RetryCallback;

public class CreditBillTasklet implements Tasklet{

	
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
	
		RetryCallback<String> retryCallback = new Defaultretryc
		
		return null;
	}

}
