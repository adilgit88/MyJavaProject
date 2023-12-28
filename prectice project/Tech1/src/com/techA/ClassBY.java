package com.techA;
//example 2
public class ClassBY 
{
	int x=10;
	public static void main(String[] args)
	{
	int x=20;
	System.out.println(x);
	System.out.println(new ClassBY().x);
	
	}
	static
	{
		int x=30;
		System.out.println(x + " ");
		
	}
}
