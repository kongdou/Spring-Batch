package fun.deepsky.springbatch.reader.flat;


import org.springframework.batch.item.ItemProcessor;

import fun.deepsky.springbatch.reader.CreditBill;

public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill>{

	@Override
	public CreditBill process(CreditBill item) throws Exception {
		System.out.println(item.toString());
		return item;
	}

}
