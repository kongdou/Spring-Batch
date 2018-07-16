package fun.deepsky.springbatch.flow.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

import fun.deepsky.springbatch.flow.Constant;

public class SplitStepExecutionListener implements StepExecutionListener{

	private String readFile;
	private String writeFile;
	
	@Override
	public void beforeStep(StepExecution stepExecution) {
		stepExecution.getJobExecution().getExecutionContext().putString(Constant.READ_FILE, readFile);
		stepExecution.getJobExecution().getExecutionContext().putString(Constant.WRITE_FILE, writeFile);
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		return stepExecution.getExitStatus();
	}

	public void setReadFile(String readFile) {
		this.readFile = readFile;
	}

	public void setWriteFile(String writeFile) {
		this.writeFile = writeFile;
	}

}
