package com.techA;

public class ClassAW 
{
void meth1()
{
	System.out.println("meth1() called");
	new ClassAW();
}
public ClassAW()
{
	System.out.println("non-parameterized constructor called");
	new ClassAW(500);
}
public ClassAW(int a)
{
	System.out.println("parameterized constructor called"+a);
}
public static void main(String[] args) 
{
ClassAW abc=new ClassAW();
abc.meth1();
new ClassAW(100);
}
	
}
