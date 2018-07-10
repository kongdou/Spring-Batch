package fun.deepsky.springbatch.writer.flat;

import java.io.IOException;
import java.io.Writer;

import org.springframework.batch.item.file.FlatFileHeaderCallback;

public class DefaultFlatFileHeaderCallback implements FlatFileHeaderCallback{

	@Override
	public void writeHeader(Writer writer) throws IOException {
		writer.write("##credit 201310 begin");
	}

}
