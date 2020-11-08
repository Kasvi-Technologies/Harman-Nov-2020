package com.harman.test;

class A extends Thread{
	
	// Threads will always executed run method...
	@Override
	public void run() {
		display ();
	}
	
	public void display () {
		for (int i = 0; i< 100; i++) {
			System.out.println("A class:" +i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class B extends Thread{
	
	// Threads will always executed run method...
	@Override
	public void run() {
			display ();
	}
		
	public void display () {
		for (int i = 0; i< 100; i++) {
			System.out.println("B class:" +i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		
		//start() is the method 
		a.start(); // will trigger the run method parallelly
		b.start(); // will automatically call the run method
		
		
	}

}
