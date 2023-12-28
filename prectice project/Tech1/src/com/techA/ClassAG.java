package com.techA;

public class ClassAG 
{
	void meth1(int x)// main() x=99
	{
		System.out.println("Hi");
		System.out.println("x value : "+x);
		System.out.println(x+1);
		
		
	}
	public static void main(String[] args)
	{
	System.out.println("Start");
	ClassAG abcd=new ClassAG();
	abcd.meth1(99);
	System.out.println("End");
	}

}
