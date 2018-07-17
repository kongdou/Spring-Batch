package fun.deepsky.batch.robust.retry.template;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryListener;
import org.springframework.retry.backoff.BackOffPolicy;
import org.springframework.retry.policy.SimpleRetryPolicy;
import org.springframework.retry.support.RetryTemplate;

public class CreditBillTasklet implements Tasklet{

	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		//定义回调，当出现重试时，调用
		RetryCallback<String> retryCallback = new DefaultRetryCallback();
		//重试监听
		RetryListener[] listeners= new RetryListener[] {new CountRetryListener()};
		//重试策略，默认重试策略，尝试3次重试
		SimpleRetryPolicy retryPolicy = new SimpleRetryPolicy();
		//补偿策略
		BackOffPolicy backOffPolicy = new DefaultBackoffPolicy();
		
		retryPolicy.setMaxAttempts(3);
		//定义RetryTemplate
		RetryTemplate template = new RetryTemplate();
		template.setRetryPolicy(retryPolicy);
		template.setListeners(listeners);
		template.setBackOffPolicy(backOffPolicy);
		template.execute(retryCallback);
		
		return RepeatStatus.FINISHED;
	}

}
