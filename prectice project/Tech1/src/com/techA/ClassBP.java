package com.techA;

public class ClassBP
{
void meth1(int i)
{
	if(i<=50)
	{
		System.out.println("if bloack Executed");
		
	}
	else
	{
		System.out.println("else block Executed");
		
	}
	
}
void checkeligibility(String name, int age)
{
	if (age>=18)
	{
		System.out.println(name +" you are Eligible for vote");
		
	}
	else 
	{
		System.out.println(name +" you are  Eligible for vote after "+(18-age)+" years");
	}
}


public static void main(String[] args)
{
	ClassBP abcd=new ClassBP();
	abcd.meth1(50);
	abcd.checkeligibility("adil", 10);
}
	
}
