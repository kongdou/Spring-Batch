package fun.deepsky.batch.robust.retry.template;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryListener;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

public class CreditBillTasklet implements Tasklet{

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		//定义回调
		RetryCallback<String> retryCallback = new DefaultRetryCallback();
		//重试监听
		RetryListener[] listeners= new RetryListener[] {new CountRetryListener()};
		//重试策略
		SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
		retryPolicy.setMaxAttempts(3);
		//定义RetryTemplate
		RetryTemplate template = new RetryTemplate();
		template.setRetryPolicy(retryPolicy);
		template.setListeners(listeners);
		
		template.execute(retryCallback);
		
		return RepeatStatus.FINISHED;
	}

}
