package fun.deepsky.batch.robust.retry.template;

import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;

public class DefaultRetryCallback implements RetryCallback<String> {

	private long sleepTime = 0L;

	public DefaultRetryCallback() {
	}

	public DefaultRetryCallback(long sleepTime) {
		this.sleepTime = sleepTime;
	}

	/**
	 * 定义重试的逻辑，doWithRetry中的逻辑发生错误的时候，根据重试模版策略会重复执行doWithRetry操作，直到满足重试策略
	 */
	@Override
	public String doWithRetry(RetryContext retryContext) throws Exception {
		
		Integer count = (Integer) retryContext.getAttribute("count");
		if (count == null) {
			count = new Integer(0);
		}
		count++;
		retryContext.setAttribute("count", count);
		Thread.sleep(sleepTime);
		System.out.println("调用回调一次，抛出异常");
		throw new RuntimeException("Mock make exception on business logic.");
	}

}
