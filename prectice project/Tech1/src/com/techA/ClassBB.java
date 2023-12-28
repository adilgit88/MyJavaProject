package com.techA;

public class ClassBB 
{
void meth1()
{
	int x=10;
	int y=20;
	System.out.println("before x:"+ x);
	x++;
	System.out.println("after x: "+ x+"\n");
	
	System.out.println("before y: "+ y);
	y--;
	System.out.println("after y;"+y);
}
void meth2()

{
	System.out.println("meth2 called");
	int i=100;
	System.out.println(i);//100 i=100
	System.out.println(i++);//100 i=101
	System.out.println(i);//101 i=101
	System.out.println(++i);//102 i=102
	System.out.println(i--);//102 i=102
	System.out.println(i);//101 i=101
	System.out.println(--i);//100 i=100
	System.out.println(i);
}
public static void main(String[] args) {
	ClassBB abcd=new ClassBB();
	abcd.meth1();
	System.out.println("_-----------------_");
	abcd.meth2();
	
}
}
