package fun.deepsky.springbatch.reader.flat;


import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import fun.deepsky.springbatch.reader.CreditBill;

public class CreditBillFieldSetMapper implements FieldSetMapper<CreditBill>{

	@Override
	public CreditBill mapFieldSet(FieldSet fieldSet) throws BindException {
		CreditBill result = new CreditBill();
		result.setAccountID(fieldSet.readString("accountID"));
		result.setAddress(fieldSet.readString("address"));
		result.setName(fieldSet.readString("name"));
		result.setAmount(fieldSet.readDouble("amount"));
		result.setDate(fieldSet.readString("date"));
		return result;
	}

}
