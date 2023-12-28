package com.techA;

public class ClassA 
{
	void meth1()
	{
		System.out.println("meth1() called()");
		int a=20;//it is a variable 
		System.out.println(a);
		
		ClassA abcd=new ClassA();
		abcd.meth2();
	}
	void meth2()
	{
		System.out.println("meth2() called");
		int x=100;
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		System.out.println("Hello World");
		System.out.println("End");
		ClassA xyz=new ClassA();
		xyz.meth1();
		
		
	}

}
