package fun.deepsky.springbatch.writer.flat;

import java.io.IOException;
import java.io.Writer;

import org.springframework.batch.item.file.FlatFileFooterCallback;

public class DefaultFlatFileFooterCallback implements FlatFileFooterCallback{

	@Override
	public void writeFooter(Writer writer) throws IOException {
		writer.write("## credit 201310 end");
	}

}
