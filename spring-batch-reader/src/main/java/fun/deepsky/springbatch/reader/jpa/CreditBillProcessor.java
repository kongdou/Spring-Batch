package fun.deepsky.springbatch.reader.jpa;

import org.springframework.batch.item.ItemProcessor;


public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill>{

	@Override
	public CreditBill process(CreditBill item) throws Exception {
		System.out.println(item.getName()+":  "+item.getAddress());
		return item;
	}
}
