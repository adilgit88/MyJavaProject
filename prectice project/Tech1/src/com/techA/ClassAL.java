package com.techA;

public class ClassAL 
{
	void meth1()
	{
		System.out.println("10");
		System.out.println("20");
		
	}
	void meth2()
	{
		System.out.print("10");
		System.out.println("20");
		
	}
	void msg()
	{
		System.out.print("java is");
		System.out.print("object oriented ");
		System.out.println("programming language");
		System.out.println("java is awesome");
		System.out.println("so i love it");
	}
	public static void main(String[] args)
	{
		ClassAL abcd=new ClassAL();
		abcd.meth1();
		System.out.println("_______");
		abcd.meth2();
		System.out.println("____");
		abcd.msg();
		
	}

}
