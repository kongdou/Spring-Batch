package fun.deepsky.springbatch.writer.flat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.batch.item.file.transform.ExtractorLineAggregator;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.util.StringUtils;

public class CustomLineAggregator extends ExtractorLineAggregator<CreditBill>{
	//定义行中字段分隔符
	private String delimiter = ";";
	private String[] names;
	
	
	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}


	public void setNames(String[] names) {
		this.names = Arrays.asList(names).toArray(new String[names.length]);
	}


	@Override
	protected String doAggregate(Object[] fields) {
		List<String> fieldList = new ArrayList<String>();
		for(int i=0;i<names.length;i++) {
			fieldList.add(names[i]+"="+fields[i]);
		}
		return StringUtils.arrayToDelimitedString(fieldList.toArray(new String[fieldList.size()]),this.delimiter);
	}
}
