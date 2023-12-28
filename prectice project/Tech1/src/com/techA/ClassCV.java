package com.techA;

import java.util.Scanner;

public class ClassCV 
{
	Scanner sc=new Scanner (System.in);

void meth1()
{
	System.out.println("meth1() called ");
	
	System.out.println("please enter 1st value");
	int a=sc.nextInt();
	System.out.println("a value :"+ a);
	
	System.out.println("please enter 2nd value");
	int b=sc.nextInt();
	System.out.println("b value :"+ b);
	
	int c=a+b;
	System.out.println("Addition :"+c);
}
int meth2()
{
	System.out.println("meht 2() called");
	System.out.println("enter value to return from meth2()");
	int x=sc.nextInt();
	return x;
}
String checkEligibility(String name,int age)
{
	System.out.println("checking vote Eligibility");
	if (age>=18)
	{
		System.out.println(name+"age is grether then 18");
		System.out.println("admin give your result");
		sc.nextLine();
		return name + " " + sc.nextLine();
	}
	else
	{
		System.out.println(name+"age is less then 18");
		System.out.println("admmin give your result");
		sc.nextLine();
		return sc.nextLine()+ " " +(18-age)+"years";
	}

}
public static void main(String[] args)
{
	ClassCV abcd=new ClassCV();
	//abcd.meth1();
	//System.out.println("value returned by meth2() ====> "+abcd.meth2());
	
	System.out.println("Enter Your Name");
	String name=abcd.sc.next();
	System.out.println("Enter Your Age");
	int age=abcd.sc.nextInt();
	System.out.println("Result:" + abcd.checkEligibility(name, age));
}
}
