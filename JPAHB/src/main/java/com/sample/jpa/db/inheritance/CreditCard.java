package com.sample.jpa.db.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue( value = "CC" )
public class CreditCard extends Account{

	@Override
	public String toString() {
		return "CreditCard [expiryMOnth=" + expiryMOnth + ", expiryYear=" + expiryYear + ", toString()="
				+ super.toString() + ", getAccountId()=" + getAccountId() + ", getAccountName()=" + getAccountName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public CreditCard(int accountId, String accountName, int expiryMOnth, int expiryYear) {
		super(accountId, accountName);
		this.expiryMOnth = expiryMOnth;
		this.expiryYear = expiryYear;
	}
	private int expiryMOnth;
	public int getExpiryMOnth() {
		return expiryMOnth;
	}
	public void setExpiryMOnth(int expiryMOnth) {
		this.expiryMOnth = expiryMOnth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	private int expiryYear;
}
