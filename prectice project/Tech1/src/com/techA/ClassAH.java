package com.techA;

public class ClassAH 
{
	void meth1(int a, String s)
	{
		System.out.println("Hi");
		System.out.println(a);
		ClassAH abcd=new ClassAH();
		abcd.meth2(100, 'Z');
		System.out.println(s);
		
	}
	void meth2(int a, char c)
	{
		System.out.println("hello");
		System.out.println(a);
		System.out.println(c);
		
	}
	public static void main(String[] args) 
	{
	ClassAH abcd=new ClassAH();
	abcd.meth1(50, "Java is Awesome");
	System.out.println("End");
	}

}
