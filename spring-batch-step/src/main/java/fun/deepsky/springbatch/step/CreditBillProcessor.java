package fun.deepsky.springbatch.step;

import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill>{

	@Override
	public CreditBill process(CreditBill bill) throws Exception {
		System.out.println(bill.getName());
		// TODO Auto-generated method stub
		Thread.sleep(10000);
		return bill;
	}
}
