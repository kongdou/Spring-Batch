package fun.deepsky.springbatch.step.skip;

import java.util.Random;

import org.springframework.batch.item.ItemProcessor;

public class RandomExceptionItemProcessor implements ItemProcessor<String, String>{

	Random ra = new Random();
	@Override
	public String process(String item) throws Exception {
		int i = ra.nextInt(10);
		System.out.println("Process:"+item+"; Random i = "+i);
		if(i%2 == 0) {
			System.out.println("====================================");
			throw new RuntimeException("error");
		}else {
			return item;
		}
	}
}
