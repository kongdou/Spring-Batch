package fun.deepsky.springbatch.reader.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import fun.deepsky.springbatch.reader.hibernate.CreditBill;

public class CreditItemWriter implements ItemWriter<CreditBill>{

	public List<CreditBill> creditBills = new ArrayList<CreditBill>();

	public void write(List<? extends CreditBill> items) throws Exception {
		creditBills.addAll(items);
	}

	public List<CreditBill> getCredits() {
		return creditBills;
	}

}
