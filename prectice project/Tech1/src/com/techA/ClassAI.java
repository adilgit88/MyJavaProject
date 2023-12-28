package com.techA;

public class ClassAI
{
	void meth1(int a, int b)
	{
		ClassAI abcd=new ClassAI();
		System.out.println(a-1);
		System.out.println(b);
		abcd.meth4(10,2,2);
		
	}
	void meth2(int x)
	{
		ClassAI abcd=new ClassAI();
		System.out.println(x);
		abcd.meth1(10, 10);
		System.out.println(x+9);
		
	}
	void meth3(int x, int y)
	{
		System.out.println(x*y);
		ClassAI abcd=new ClassAI();
		System.out.println(y);
		abcd.meth2(1);
				
	}
	void meth4(int a, int b, int c)
	{
		System.out.println(a+b);
		System.out.println(a/c);
		System.out.println(a-b);
		System.out.println(a*b);
		
	}
	public static void main(String[] args)
	{
		ClassAI abcd=new ClassAI();
		abcd.meth3(5, 2);
	}

}
