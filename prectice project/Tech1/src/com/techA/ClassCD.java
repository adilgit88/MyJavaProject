package com.techA;

public class ClassCD 
{
static int x=m1();
public static void main(String[] args)
{
System.out.println(ClassCD.x);	
}
static
{
	System.out.println(x);
	ClassCD.x=x+20;
	
}
static int m1()
{
	ClassCD.x=50;
	System.out.println(ClassCD.x);
	return 100;
	
}
}
