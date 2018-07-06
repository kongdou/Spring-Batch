package fun.deepsky.springbatch.reader.flat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import fun.deepsky.springbatch.reader.CreditBill;
import fun.deepsky.springbatch.reader.DebitBill;

public class MultiItemWriter<T> implements ItemWriter<T>{

	private List<ItemWriter<? super T>> delegates;
	
	public void setDelegates(List<ItemWriter<? super T>> delegates) {
		this.delegates = delegates;
	}
	@Override
	public void write(List<? extends T> items) throws Exception {
		ItemWriter creditWriter = delegates.get(0);
		ItemWriter debigWriter = delegates.get(1);
		
		List<CreditBill> credits = new ArrayList<CreditBill>();
		List<DebitBill> debigs = new ArrayList<DebitBill>();
		
		for(int i=0;i<items.size();i++) {
			if("CreditBill".equals(items.get(i).getClass().getSimpleName())) {
				credits.add((CreditBill)items.get(i));
			}else {
				debigs.add((DebitBill)items.get(i));
			}
		}
		if(credits.size() > 0) {
			creditWriter.write(credits);
		}
		if(debigs.size() > 0) {
			debigWriter.write(debigs);
		}
	}

}
