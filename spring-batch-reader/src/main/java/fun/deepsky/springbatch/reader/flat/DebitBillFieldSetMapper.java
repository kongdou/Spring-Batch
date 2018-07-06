package fun.deepsky.springbatch.reader.flat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import fun.deepsky.springbatch.reader.DebitBill;

public class DebitBillFieldSetMapper implements FieldSetMapper<DebitBill>{

	@Override
	public DebitBill mapFieldSet(FieldSet fieldSet) throws BindException {
		DebitBill debitBill = new DebitBill();
		debitBill.setAccountID(fieldSet.readString("accountID"));
		debitBill.setName(fieldSet.readString("name"));
		debitBill.setAmount(fieldSet.readDouble("amount"));
		debitBill.setDate(fieldSet.readString("date"));
		return debitBill;
	}

}
