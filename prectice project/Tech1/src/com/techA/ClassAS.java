package com.techA;

public class ClassAS 
{
void meth1() 
{
System.out.println("meht1() called");
int a=10;
int b=20;
int c=a+b;
System.out.println("c value : "+ c);
return;
}
int meth2()
{
	System.out.println("meth2() called");
	return 100;
	//System.out.println("Hello World");
}
int meth3()
{
	System.out.println("meth3() called");
	System.out.println("int & char both are compatble datatypes");
	return 'a';
}
int meth4(int i)
{
	if (i<=100)
	{
		System.out.println("if block exuted");
		return 1000;
		//System.out.println("hi");
		
	}
	else
	{
	System.out.println("else block executed");
	return 5000;
	//System.out.println("HELLO");
	}
	
}
public static void main(String[] args) 
{
System.out.println("Start");
ClassAS abc=new ClassAS();
abc.meth1();
System.err.println("____________");
abc.meth2();
System.out.println("___________");
int x=abc.meth3();
System.out.println("meht3() is returning:" + x);
System.out.println("____________");
int y=abc.meth4('A');
System.out.println("meth4() is returning:" + y);
System.out.println("END");

}

}
