package fun.deepsky.springbatch.reader.db;

import org.springframework.batch.item.ItemProcessor;

import fun.deepsky.springbatch.reader.CreditBill;

public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill>{

	@Override
	public CreditBill process(CreditBill item) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(item.getName()+":  "+item.getAddress());
		return item;
	}
}
