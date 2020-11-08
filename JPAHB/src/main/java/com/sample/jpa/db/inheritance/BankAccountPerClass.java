package com.sample.jpa.db.inheritance;
import javax.persistence.Entity;

@Entity

public class BankAccountPerClass extends AccountPerClass{

	public BankAccountPerClass(int accountId, String accountName, String type, double amount) {
		super(accountId, accountName);
		this.type = type;
		this.amount = amount;
	}
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	private double amount;
	

}
