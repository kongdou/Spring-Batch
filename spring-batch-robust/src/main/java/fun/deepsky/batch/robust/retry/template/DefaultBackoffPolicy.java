package fun.deepsky.batch.robust.retry.template;

import org.springframework.retry.RetryContext;
import org.springframework.retry.backoff.BackOffContext;
import org.springframework.retry.backoff.BackOffInterruptedException;
import org.springframework.retry.backoff.BackOffPolicy;

public class DefaultBackoffPolicy implements BackOffPolicy{

	@Override
	public void backOff(BackOffContext backOffContext) throws BackOffInterruptedException {
		// TODO Auto-generated method stub
		CountHelper.decrement();
		System.out.println("补偿策略执行，次数减1:"+CountHelper.getCount());
	}

	@Override
	public BackOffContext start(RetryContext retryContext) {
		// TODO Auto-generated method stub
		System.out.println("默认补偿策略start...");
		BackOffContext backOffContext = new BackOffContextImpl(retryContext);
		return backOffContext;
	}

}
