package fun.deepsky.springbatch.step.skip;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class ConsoleWriter implements ItemWriter<String>{

	@Override
	public void write(List<? extends String> items) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Write begin:");
		for(String item : items){
			System.out.print(item + ",");
		}
		System.out.println("Write end!!");
	}

}
