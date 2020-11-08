package com.harman.innerclass.example;

public class LocalInnerEx {
	
	private int data =100;
	
	public void display() {
		//Local inner class - a class created with in a class method
		class LocalInner {
			void innerMethod () {				
				System.out.println("inner class inner method.." + data);
			}
		}
		
		LocalInner localInner = new LocalInner();
		localInner.innerMethod();
	}

}

class LocalInnerEx1 { 
	private int data=100; 
	public void display() { 
		class LocalInner { 
			void innerMethod() { 
				System.out.println("inner class inner method...."+data); 
			}
		}
		// class closure
		LocalInner li=new LocalInner(); 
		li.innerMethod(); 
	}
} 
