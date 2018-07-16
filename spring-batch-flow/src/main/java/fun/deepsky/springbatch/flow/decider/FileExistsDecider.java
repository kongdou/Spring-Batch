package fun.deepsky.springbatch.flow.decider;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

import fun.deepsky.springbatch.flow.Constant;
import fun.deepsky.springbatch.flow.CreditService;

public class FileExistsDecider implements JobExecutionDecider{

	private CreditService creditService;
	
	@Override
	public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
		String readFile = stepExecution.getJobParameters().getString(Constant.READ_FILE_NAME);
		String workDirectory = stepExecution.getJobParameters().getString(Constant.WORK_DIRECTORY);
		System.out.println("文件路径，判断："+workDirectory+readFile);
		if(creditService.exists(workDirectory+readFile)) {
			return new FlowExecutionStatus("FILE EXISTS");
		}else {
			return new FlowExecutionStatus("NO FILE");
		}
	}

	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}
	

}
