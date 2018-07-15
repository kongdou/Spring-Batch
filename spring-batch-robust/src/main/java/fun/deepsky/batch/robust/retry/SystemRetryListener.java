package fun.deepsky.batch.robust.retry;

import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryListener;

public class SystemRetryListener implements RetryListener{
	
	public <T> boolean open(RetryContext context, RetryCallback<T> callback) {
		//System.out.println("SystemOutRetryListener.open()");
		return true;
	}

	public <T> void close(RetryContext context, RetryCallback<T> callback,
			Throwable throwable) {
		//System.out.println("SystemOutRetryListener.close()");
	}
	
	public <T> void onError(RetryContext context, RetryCallback<T> callback,
			Throwable throwable) {
		System.out.println("SystemOutRetryListener.onError()");
	}
	
}