package fun.deepsky.springbatch.step.transaction;

import org.springframework.batch.item.ItemProcessor;

public class TransactionItemProcessor implements ItemProcessor<String,String>{

	private String errorCount = "3";
	@Override
	public String process(String item) throws Exception {
		System.out.println("TransactionItemProcessor.process() item is:" + item);
		if(errorCount.equals(item)){
			throw new RuntimeException("make error!");
		}
		return item;
	}

	public String getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(String errorCount) {
		this.errorCount = errorCount;
	}
}
