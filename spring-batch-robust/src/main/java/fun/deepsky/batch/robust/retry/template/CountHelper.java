/**
 * 
 */
package fun.deepsky.batch.robust.retry.template;

import java.util.concurrent.atomic.AtomicInteger;

public class CountHelper {
	private static AtomicInteger count = new AtomicInteger(0);
	public static void init(){
		count = new AtomicInteger(0);
	}
	
	public static int getCount(){
		return count.get();
	}
	
	public static void increment(){
		count.incrementAndGet();
	}
	public static int incrementAndGet(){
		return count.incrementAndGet();
	}
	
	public static void decrement(){
		count.decrementAndGet();
	}
	
	public static int decrementAndGet(){
		return count.decrementAndGet();
	}
}
