package fun.deepsky.batch.robust.retry;

import java.util.Random;

import org.springframework.batch.item.ItemProcessor;

public class RadomExceptionItemProcessor implements ItemProcessor<String,String>{

	Random ra = new Random();
	
	@Override
	public String process(String item) throws Exception {
		//int i = ra.nextInt(10);
		Integer i = Integer.parseInt(item);
		if(i%2 == 0) {
			System.out.println("run time Exception...");
			throw new RuntimeException("make error");
		}else{
			return item;
		}
	}

}
