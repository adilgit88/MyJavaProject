package com.techA;

public class ClassBV 
{
	final static int x;
	
	static void meth1() {
	
		{
			System.out.println("meth1() called");
			//x=100; // C.E because we can't initialize a final static variable inside a method
			System.out.println("x value : "+ x);
			
		}
	}
	
	static
	{
		x=100;
		System.out.println("1st Static block called "+x);
	}
	
	
	public static void main(String[] args) 
	{
	System.out.println("Class ZV main() called");
	ClassBV.meth1();
	}
	static
	{
		//x=100;// C.E because final variable are CONSTANTS
		System.out.println("2nd Static block called "+x);
	}
	
}
