package com.techA;

public class ClassAV 
{
int x=10; //instance variable
static int y=20;

boolean flag;
static float f;

int i=100;
//static int i=500; // C.E
// String i="java"; // C.E

void meth1()
{
	int z=30;// local variable
	
	System.out.println("instance variable x :"+x);// by using identifier name 
	System.out.println("instance variable x :"+new ClassAV().x+"e\n"); // by using class object
	
	System.out.println("static variable y :"+y);
	System.out.println("static variable y :"+new ClassAV().y);//by using class object
	System.out.println("static variable y :"+ClassAV.y+"\n");//by using CLASSNAME.
	
	System.out.println("instance variable z :"+z); // by using identifier name 
	
	

}
void meth2()
{
	
	System.out.println("meth 2() calling");
	System.out.println("instance variable x :"+x);// by using identifier name 
	System.out.println("instance variable x :"+new ClassAV().x+"\n"); // by using class object
	
	System.out.println("static variable y :"+y);
	System.out.println("static variable y :"+new ClassAV().y);//by using class object
	System.out.println("static variable y :"+ClassAV.y+"\n");//by using CLASSNAME.
	
	//System.out.println("instance variable z :"+z); // C.E
	
}
void meth3()
{
	System.out.println("meth3() called");
	int x=100;
	int y=200;
	System.out.println("instance variable x :"+ new ClassAV().x);
	System.out.println("static Variables y:"+ ClassAV.y);
	System.out.println("loacal variables x:"+x+ "y:"+y);
	
	
}
void meth4()

{
	System.out.println("meth4() called ");
	char c;
	System.out.println("instance variable flag:"+ flag);
	System.out.println("static variable");
}
}

