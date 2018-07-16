package fun.deepsky.springbatch.flow.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

import fun.deepsky.springbatch.flow.Constant;

public class VerifyStepExecutionListener implements StepExecutionListener{

	@Override
	public void beforeStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		String status = stepExecution.getExecutionContext().getString(Constant.VERITY_STATUS);
		if(null != status){
			return new ExitStatus(status);
		}
		return stepExecution.getExitStatus();
	}

}
