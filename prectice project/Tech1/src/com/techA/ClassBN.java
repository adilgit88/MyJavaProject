package com.techA;

public class ClassBN 
{
	void meth1(int a, int b, int c)
	{
		a=10;
		b=20;
		c=30;
		int d=a+b+c;
		System.out.println("Addition");
		System.out.println("d value :"+d);
		new ClassBN().meth2(10, 5);
		
		
		
		
	}
	void meth2(int x, int y)
	{
		x=50;
		y=70;
		int z=x-y;
		System.out.println("Substraction");
		System.out.println("z value :"+z);
	}
	public ClassBN()
	{
		int e=10;
		int f=5;
		int h=e/f;
		System.out.println("Division");
		System.out.println("h value :"+h);
		ClassBN abcd=new ClassBN("JAVA");
		abcd.meth1(10, 10, 90);
	}
	public ClassBN(String e)
	{
		int j=10;
		int k=5;
		int l=j*k;
		System.out.println("Multiplication");
		System.out.println("z value :"+l);
	}
public static void main(String[] args)
{
	new ClassBN();
	
}

}


