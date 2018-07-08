package fun.deepsky.springbatch.reader.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_credit")
public class CreditBill {

	@Id
	@Column(name="ID")
	private String id;
	
	@Column(name="ACCOUNTID")
	private String accountID;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@Column(name="DATE")
	private String date;
	
	@Column(name="ADDRESS")
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("id=" + getId()+ ";accountID=" + getAccountID() + ";name=" + getName() + ";amount="
				+ getAmount() + ";date=" + getDate() + ";address=" + getAddress());
		return sb.toString();
	}
	
}
