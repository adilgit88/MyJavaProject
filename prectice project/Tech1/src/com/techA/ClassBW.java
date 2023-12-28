package com.techA;

public class ClassBW
{
	static int x=meth1();
	static int meth1()
	{
		System.out.println("meth1() called");
		meth2();
		return 'A';//ascii value for 'A' is 65
		
	}
	static void meth2()//static method will be executed only whenever we are calling it
	
	{
	System.out.println("meth2() called");	
	}
	static
	{
		System.out.println("static block :"+x);
	}
	public static void main(String[] args)

	{
		System.out.println("java is awesome");
	}		
			
			
}
