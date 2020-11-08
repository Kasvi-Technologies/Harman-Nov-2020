package com.harman.test;

class Sample1 extends Thread {

	public Sample1 (String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(this.getName() + " run method started..");
		print(10);
	}
	
	public void print (int val) {
		
		for (int i = 0; i< val;i++) {
			System.out.println(this.getName() + " " + + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class Sample2 extends Thread {

	public Sample2 (String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(this.getName() + " run method started..");
		print(5);
	}
	
	public void print (int val) {
		
		for (int i = 0; i< val;i++) {
			System.out.println(this.getName() + " " +i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

public class SampleThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PS ps = new PSImpl();
		Thread t1 = new Sample1("Sample1 Thread");
		Thread t2 = new Sample2("Sample2 Thread");
		
		//t1.setName(name);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Business logic..
		//send the SMS only after completion of account debited or credited
		//send the SMS
		System.out.println("Main method completed...");
		
	}

}
