package com.harman.test;

import com.harman.threadsex.BankAccount;
import com.harman.threadsex.DepositThread;
import com.harman.threadsex.WithdrawThread;

public class BankAccountThreadsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount(600);
		
		//BankAccount bankAccount1 = new BankAccount(600);
		//bankAccount is shared resource to multiple threads
		
		//shared resource will be in waiting state until other synchronized method completes
		Thread withdrawThread  = new WithdrawThread(bankAccount);		
		Thread depositThread  = new Thread (new DepositThread(bankAccount));
		
		//Here both are not shared., and so both can execute at same time
		// since first thread will obtain lock on bankAccount
		//second thread will obtain lock on bankAccount1
		
//		Thread withdrawThread  = new WithdrawThread(bankAccount);		
//		Thread depositThread  = new DepositThread(bankAccount1);
//				
		withdrawThread.start();
		depositThread.start();
		
	}

}
