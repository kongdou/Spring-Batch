package fun.deepsky.springbatch.flow;

import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill>{

	@Override
	public CreditBill process(CreditBill item) throws Exception {
		System.out.println("正在处理："+item.getName());
		return item;
	}
}
