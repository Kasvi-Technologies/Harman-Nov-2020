package com.harman.threadsex;

public class WithdrawThread extends Thread{

	private BankAccount bankAccount;
	
	public WithdrawThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void run () {
		System.out.println("WithdrawThread run method started..:");
		
		bankAccount.withdraw(1000);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("WithdrawThread run method ended..:"
				+ bankAccount.getAmount());
	}
}
