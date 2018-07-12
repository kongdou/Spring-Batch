package fun.deepsky.springbatch.writer.reuse;

import java.util.ArrayList;
import java.util.List;

public class ExistService {

	List<CreditBill> billList = new ArrayList<CreditBill>();

	public void insert(CreditBill creditBill) {
		billList.add(creditBill);
		System.out.println("ExistService insert:" + creditBill.toString());
	}

	public void insert(String accountID, String name, double amount, String date, String address) {
		CreditBill creditBill = new CreditBill(accountID, name, amount, date, address);
		billList.add(creditBill);
		System.out.println("ExistService insert:" + creditBill.toString());
	}
}
