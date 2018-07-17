package fun.deepsky.batch.robust.retry.template;

import org.springframework.retry.RetryCallback;
import org.springframework.retry.RetryContext;
import org.springframework.retry.RetryListener;

public class CountRetryListener implements RetryListener{

	@Override
	public <T> void close(RetryContext arg0, RetryCallback<T> arg1, Throwable arg2) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public <T> void onError(RetryContext arg0, RetryCallback<T> arg1, Throwable arg2) {
		// TODO Auto-generated method stub
		CountHelper.increment();
		System.out.println("CountRetryListener.onError()");
	}

	@Override
	public <T> boolean open(RetryContext arg0, RetryCallback<T> arg1) {
		// TODO Auto-generated method stub
		return true;
	}

}
