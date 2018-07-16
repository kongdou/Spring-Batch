package fun.deepsky.springbatch.flow.tasklet;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import fun.deepsky.springbatch.flow.CreditService;

public class DecompressTasklet implements Tasklet{

	private CreditService creditService;
	private String inputFile;
	private String outputDirectory;
	
	
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		System.out.println("将文件："+inputFile+" 解压到"+outputDirectory+"目录下");
		creditService.decompress(inputFile, outputDirectory);
		return RepeatStatus.FINISHED;
	}


	public void setCreditService(CreditService creditService) {
		this.creditService = creditService;
	}


	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}


	public void setOutputDirectory(String outputDirectory) {
		this.outputDirectory = outputDirectory;
	}
	
	

	
}
