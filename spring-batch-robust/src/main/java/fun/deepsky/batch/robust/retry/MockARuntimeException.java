/**
 * 
 */
package fun.deepsky.batch.robust.retry;

public class MockARuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3841087497940611523L;
	public MockARuntimeException(){
		super();
	}
	public MockARuntimeException(String message){
		super(message);
	}
}
