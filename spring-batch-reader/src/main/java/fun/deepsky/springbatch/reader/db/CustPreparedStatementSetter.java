package fun.deepsky.springbatch.reader.db;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

public class CustPreparedStatementSetter implements PreparedStatementSetter{

	@Override
	public void setValues(PreparedStatement ps) throws SQLException {
		// TODO Auto-generated method stub
		ps.setString(1, "5");
	}

}
