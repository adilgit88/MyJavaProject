package com.techA;

public class ClassBU
{
int x=100;//instance (or) non-static (or) Global variable
static int y=200;// static variable (or) class variable

void meth1()// non-static method/ normal method / concrete method
{
	System.out.println("meth1() called");
	System.out.println("instance variable :"+x);
	System.out.println("static variable : "+y);
}
static void meth2()//static method
{
	System.out.println("meth2 called");
	System.out.println("instance variable :"+new ClassBU().x);
	System.out.println("static variable : "+y);
	
}
public static void main(String[] args) 

{
	//meth1();//C.E because we are using by identifier name(due to 'this' keyword to be discussed later)
	new ClassBU().meth1();//by using class object 
	//ClassZU().meth1();// by using Class name
	
	System.out.println("-----------");
	
	meth2();//by using identifier name
	new ClassBU().meth2();//by using class object 
	ClassBU.meth2();// by using Class name
}
}

