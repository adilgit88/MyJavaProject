package com.techA;


public class ClassCE 
{
static int a=0;
int b=0;

ClassCE()
{
	a++;//a=1
	b++;//b=1
	System.out.println("static variable ===>"+a);//a=1
	System.out.println("instance variable ===>"+b);//b=1
	System.out.println("------");
}
void display()
{
	System.out.println("*******Accessing static variable****");
	System.out.println(ClassCE.a);
	System.out.println(a);
	System.out.println(new ClassCE().a);
}
public static void main(String[] args) {
	new ClassCE();
	new ClassCE();
	new ClassCE();
	System.out.println("###############");
	new ClassCE().display();
	
	
}
}

