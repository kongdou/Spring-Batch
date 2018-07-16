package fun.deepsky.springbatch.flow.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

import fun.deepsky.springbatch.flow.Constant;

public class ShareDataStepExecutionListener implements StepExecutionListener {

	/*
	 * 路径信息放到ExecutionContext中， (non-Javadoc)
	 * 
	 * @see org.springframework.batch.core.StepExecutionListener#beforeStep(org.
	 * springframework.batch.core.StepExecution)
	 */
	@Override
	public void beforeStep(StepExecution stepExecution) {
		String readFileName = stepExecution.getJobParameters().getString(Constant.READ_FILE_NAME);
		String workDirectory = stepExecution.getJobParameters().getString(Constant.WORK_DIRECTORY);
		String writeTarget = stepExecution.getJobParameters().getString(Constant.WRITE_TARGET);

		System.out.println("Step:"+stepExecution.getStepName());
		stepExecution.getJobExecution().getExecutionContext().putString(Constant.READ_FILE,
				workDirectory + readFileName);
		stepExecution.getJobExecution().getExecutionContext().putString(Constant.WRITE_FILE, writeTarget);
	}
	

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		return stepExecution.getExitStatus();
	}

}
