package fun.deepsky.springbatch.reader.flat;

import org.springframework.batch.item.file.LineCallbackHandler;

public class DefaultLineCallbackHandler implements LineCallbackHandler{

	@Override
	public void handleLine(String line) {
		System.out.println("Skipped line content:"+line);
		
	}

}
