/**
 * 
 */
package fun.deepsky.batch.robust.retry;

public class MockBRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3841087497940611523L;
	public MockBRuntimeException(){
		super();
	}
	
	public MockBRuntimeException(String message){
		super(message);
	}
}
