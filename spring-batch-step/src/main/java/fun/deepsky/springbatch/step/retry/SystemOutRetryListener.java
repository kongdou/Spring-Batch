package fun.deepsky.springbatch.step.retry;

import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryListener;

public class SystemOutRetryListener implements RetryListener{

	@Override
	public <T> void close(RetryContext arg0, RetryCallback<T> arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		System.out.println("SystemOutRetryListener.close()");
	}

	@Override
	public <T> void onError(RetryContext arg0, RetryCallback<T> arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		System.out.println("SystemOutRetryListener.onError()");
	}

	@Override
	public <T> boolean open(RetryContext arg0, RetryCallback<T> arg1) {
		// TODO Auto-generated method stub
		System.out.println("SystemOutRetryListener.open()");
		return true;
	}

}
