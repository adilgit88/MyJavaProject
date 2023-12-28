package com.techA;

public class ClassAF
{
	void meth1()
	{
		int x=100;
		int y=50;
		System.out.println("Addition x+y=?");
		System.out.println("x:100");
		System.out.println("y:50");
		System.out.println(x+y);
		
	}
	void meth2()
	{
		int x=100;
		int y=50;
		
		System.out.println("Subtraction x-y=?");
		System.out.println("x:100");
		System.out.println("y:50");
		System.out.println(x-y);
		
	}
	void meth3()
	{
		int x=100;
		int y=50;
		
		System.out.println("multiplication x*y=?");
		System.out.println("x:100");
		System.out.println("y:50");
		System.out.println(x*y);
		
	}
	void meth4()
	{
		int x=100;
		int y=50;
		
		System.out.println("division x/y=?");
		System.out.println("x:100");
		System.out.println("y:50");
		System.out.println(x/y);
		
	}
	public static void main(String[] args)
	{
		ClassAF abcd=new ClassAF();
		abcd.meth1();
		abcd.meth2();
		abcd.meth3();
		abcd.meth4();
		System.out.println("End");
	}

}
