package fun.deepsky.batch.robust.retry.template;

import org.springframework.retry.RetryContext;
import org.springframework.retry.backoff.BackOffContext;

public class BackOffContextImpl implements BackOffContext{

	private RetryContext retryContext;
	
	public BackOffContextImpl() {
		
	}
	
	public BackOffContextImpl(RetryContext retryContext) {
		this.retryContext = retryContext;
	}

	public RetryContext getRetryContext() {
		return retryContext;
	}

	public void setRetryContext(RetryContext retryContext) {
		this.retryContext = retryContext;
	}
	
}
