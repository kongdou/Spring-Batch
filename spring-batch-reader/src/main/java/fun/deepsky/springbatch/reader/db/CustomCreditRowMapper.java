package fun.deepsky.springbatch.reader.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fun.deepsky.springbatch.reader.CreditBill;

public class CustomCreditRowMapper implements RowMapper<CreditBill>{

	@Override
	public CreditBill mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		CreditBill creditBill = new CreditBill();
		creditBill.setAccountID(rs.getString("ACCOUNTID"));
		creditBill.setAddress(rs.getString("ADDRESS"));
		creditBill.setAmount(rs.getDouble("AMOUNT"));
		creditBill.setDate(rs.getString("DATE"));
		creditBill.setName(rs.getString("NAME"));
		return creditBill;
	}

}
