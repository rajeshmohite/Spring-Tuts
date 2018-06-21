package com.psl.bean;

public class A {

	private I i;

	public A(){
		System.out.println("A");
	}

	public void setI(I i) {             //////////Approach - DI with Interfaces
		this.i = i;
	}

	/*public A(I i) {					//////////Approach - DI with Interfaces
		super();
		System.out.println("A");
		this.i = i;
	}*/
	/*public A(B b) {					//////////Approach 1
		super();
		System.out.println("A");
		this.b = b;
	}*/

/*	public void setB(B b) {				//////////Approach 2
		this.b = b;
	}*/
	
	 
	
	
}
