package com.harman.threadsex;

//Thread class
//Runnable interfaces

//public class DepositThread extends Thread{

public class DepositThread implements Runnable{

	private BankAccount bankAccount;
	
	public DepositThread(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public void run () {
		System.out.println("DepositThread run method started..:");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bankAccount.deposit(1000);
		
		
		
		System.out.println("DepositThread run method ended..:" 
					+ bankAccount.getAmount());
	}
}
