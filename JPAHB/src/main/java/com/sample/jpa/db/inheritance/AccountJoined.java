package com.sample.jpa.db.inheritance;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

@Inheritance( strategy = InheritanceType.JOINED )
public class AccountJoined implements Serializable{
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + "]";
	}
	public AccountJoined(int accountId, String accountName) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
	}
	
	@Id
	private int accountId;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	private String accountName;	

}
