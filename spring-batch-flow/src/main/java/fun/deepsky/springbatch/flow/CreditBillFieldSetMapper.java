package fun.deepsky.springbatch.flow;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class CreditBillFieldSetMapper implements FieldSetMapper<CreditBill>{

	@Override
	public CreditBill mapFieldSet(FieldSet fieldSet) throws BindException {
		// TODO Auto-generated method stub
		CreditBill creditBill = new CreditBill();
		creditBill.setAccountID(fieldSet.readString("accountID"));
		creditBill.setAddress(fieldSet.readString("address"));
		creditBill.setAmount(fieldSet.readDouble("amount"));
		creditBill.setDate(fieldSet.readString("date"));
		creditBill.setName(fieldSet.readString("name"));
		return creditBill;
	}

}
