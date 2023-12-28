package com.techA;

public class ClassCK
{
void meth1(int i)//i=10
{
	System.out.println("------------meth1()-----");
	if(i==10)
	{
		System.out.println("HI");
		
	}
	System.out.println("meth 1 () Executed");
	
}
void meth2(int i)	//i=100
{
	System.out.println("------------meth2()-----");
	if(i<=10)
		//int x=50;//C.e becz we cant write delerative stateements in this line 
		System.out.println("HI");
		System.out.println("java is Aww");
		System.out.println("meth2() executed");
	
}
void meth3(int i)//i=65
{
	System.out.println("------------meth3()-----");
	if(!(i<=100)|| 100>=i)//(or) (!(i<=100) || 100>=i)
	{
		System.out.println("HI");
		System.out.println("if block exe");
		
	}
	else
	{
		System.out.println("hello");
		System.out.println("else blcok exe");
	}
	System.out.println("meth3() exe cpmleted");
}
void meth4(int i)
{
	System.out.println("------------meth4()-----");
	if(false)
	{
		System.out.println("HI");
		System.out.println("if block exe");
	}
	else 
	{
		System.out.println("hello");
		System.out.println("else block exe");
		
	}
	System.out.println("");
	
}
int meth5()
{
	System.out.println("meth5() called");
	return 10;
}
void meth6()
{
	System.out.println("------------meth6()-----");
	int i;
	if((i=new ClassCK().meth5())<=1)
	{
		//int x=50;
		System.out.println("if block exe");
		System.out.println("hi");
	}
	else
	{
	System.out.println("else block exe");
	System.out.println("hello");
	System.out.println("meth6() exe");
	}		
}
int meth7(int i)
{
	System.out.println("------------meth7()-----");
	if(i>=50)
	return 100;
	return 200;
		//System.out.println("Hello");

}
void meth8(int num)
{
	System.out.println("------------meth8()-----");
	if(num>0)
		System.out.println(num+"is positive");
	else if(num<0)
		System.out.println(num+"is negative");
	else
		System.out.println(num+"is equal to 0");
}
public static void main(String[] args) 
{
	ClassCK abcd=new ClassCK();	
	abcd.meth1(0);
	abcd.meth2(10);
	abcd.meth3(100);
	abcd.meth4(50);
	abcd.meth6();
	abcd.meth8(60);
}

}















