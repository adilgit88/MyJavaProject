package com.techA;

public class ClassAX 
{
public ClassAX()
{
	System.out.println("sunday");
	ClassAX abc=new ClassAX(10);
	System.out.println("tuesday");
	String s=abc.display("challange Accepted");
	System.out.println(s);
}
public ClassAX(int temp)
{
	System.out.println("saturday");
	ClassAX abc=new ClassAX(10, 20);
	int a=abc.meth1()+temp;
	System.out.println("==>"+(a+abc.meth2()));
	System.out.println("monday");
}
String display(String s)
{
	System.out.println("in the next statement i am returning String value");
	return s;
}
int meth1()
{
	return 100;
	
}
int meth2()
{
	return 99;
	
}
public ClassAX(int data, int temp)
{
	System.out.println("thursday");
	System.out.println("====>"+(data+new ClassAX("HI").meth2()-temp));
	
	
}
ClassAX(String s)
{
System.out.println(s);	
}
public static void main(String[] args) 
{
ClassAX abc=new ClassAX();
System.out.println("output verified");
}
}
