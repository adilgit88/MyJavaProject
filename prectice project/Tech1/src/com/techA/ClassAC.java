package com.techA;

public class ClassAC 
{
	int meth1()//main()
	{
		System.out.println("HI");
		return 99;
	}
	public static void main(String[] args)
	{
	System.out.println("Java is Awesome");
	ClassAC abcd=new ClassAC();
	int x=abcd.meth1();
	System.out.println("meth1()is returning : " + x);
	System.out.println(x+1);
	}

}
