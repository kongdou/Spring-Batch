package fun.deepsky.springbatch.step.retry;

public class MockARuntimeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MockARuntimeException() {
		super();
	}
	public MockARuntimeException(String message){
		super(message);
	}
	
}
