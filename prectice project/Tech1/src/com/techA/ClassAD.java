package com.techA;

public class ClassAD 
{
int meth1()
{
	System.out.println("Hi");
	int x=new ClassAD().meth2();
	System.out.println(x/2);
	return 1;
}
int meth2()
{
	System.out.println("hello");
	String msg=new ClassAD().meth3();
	System.out.println(msg);
	return 50;
	}
String meth3()
{
	System.out.println("Java is Awesome");
	return "Hello World";
	
}
public static void main(String[] args) {
	new ClassAD().meth1();
}
}
