package com.harman.threadsex;

public class BankAccount {
	
	private int amount;
	
	public int getAmount() {
		return amount;
	}

	public BankAccount (int amount) {
		this.amount = amount;
	}
	
	//it will obtain the lock on calling instance
	//bankAccount 
	//
	// if a synchronzed method is already executed by another threads,
	//then it will wait until lock needs to be removed from the calling instance
	
	public synchronized void deposit (int depositAmount) {
		System.out.println("Deposit method started...");
		if (depositAmount >0) {
			this.amount = this.amount + depositAmount;
			notify();
		}		
		System.out.println("Deposit method ended...");
	}
	
	//it will obtain the lock on calling instance
		//bankAccount 
	public synchronized void withdraw (int withdrawAmount) {
		
		System.out.println("Withdraw method started...");
		
		while (this.amount < withdrawAmount) {
			System.out.println("amount is less than withdraw amount : original amount "
							+ this.amount + " trying to withdraw " + withdrawAmount);
			try {
				System.out.println("waiting for some one to deposit amount.......");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("after depositit done.. and notified back...");
		if (withdrawAmount <= this.amount) {
			this.amount = this.amount - withdrawAmount;
		}		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("withdraw method ended...");
	}

}
