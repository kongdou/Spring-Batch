package fun.deepsky.batch.robust.restart;

import java.util.Random;

import org.springframework.batch.item.ItemProcessor;

public class RadomExceptionItemProcessor implements ItemProcessor<String,String>{

	Random ra = new Random();
	
	@Override
	public String process(String item) throws Exception {
		int i = ra.nextInt(10);
		System.out.println(i);
		if(i%3 == 0) {
			throw new RuntimeException("make error");
		}else{
			return item;
		}
	}

}
