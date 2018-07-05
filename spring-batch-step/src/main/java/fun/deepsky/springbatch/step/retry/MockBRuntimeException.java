package fun.deepsky.springbatch.step.retry;

public class MockBRuntimeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MockBRuntimeException() {
		super();
	}
	
	public MockBRuntimeException(String message) {
		super(message);
	}
}
