package fun.deepsky.springbatch.writer.reuse;

import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements
		ItemProcessor<CreditBill, CreditBill> {

	public CreditBill process(CreditBill bill) throws Exception {
		System.out.println(bill.toString());
		return bill;
	}
}
