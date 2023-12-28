package com.techA;

public class ClassAB 
{
void meth1()
{
	System.out.println("Hi");
}
void meth2()
{
	System.out.println("Hello");
}
public static void main(String[] args)
{
	ClassAB abcd=new ClassAB();
	abcd.meth1();
	abcd.meth2();
	
	System.out.println("___________");
	
	new ClassAB().meth1();//2nd way
	new ClassAB().meth2();
}
}
