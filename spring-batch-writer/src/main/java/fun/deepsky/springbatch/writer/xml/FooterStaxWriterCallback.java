package fun.deepsky.springbatch.writer.xml;

import java.io.IOException;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.StepExecutionListenerSupport;
import org.springframework.batch.item.xml.StaxWriterCallback;

public class FooterStaxWriterCallback extends StepExecutionListenerSupport implements StaxWriterCallback{

	private StepExecution stepExecution;
	
	@Override
	public void write(XMLEventWriter writer) throws IOException {
		XMLEventFactory factory = XMLEventFactory.newInstance();
		try {
			writer.add(factory.createComment("Total write count = "
					+ stepExecution.getWriteCount() + ";credit 201310 end."));
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void beforeStep(StepExecution stepExecution) {
		this.stepExecution = stepExecution;
	}

}
