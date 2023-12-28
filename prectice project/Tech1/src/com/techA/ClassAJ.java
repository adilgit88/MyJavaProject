package com.techA;

public class ClassAJ
{
int meth1()
{
	System.out.println("meth1() called()");
	return 10;
}
int meth2()
{
	System.out.println("meth2() called");
	return 20;
}
String meth3(int x, int y)//x=10 y=20
{
	System.out.println("meth3() called()");
	System.out.println("x  :  "+ x);
	System.out.println("y  :  "+ y);
	System.out.println("Addition :"+(x+y));
	new ClassAJ().meth4();
	return "Java is Awesome";
	
	
}
void meth4()
{
	System.out.println("Java is Amezing");
	
}
public static void main(String[] args)
{
System.out.println("Start");
ClassAJ abcd=new ClassAJ();
String msg=abcd.meth3(abcd.meth1(),abcd.meth2());// abcd.meth3(10,20)
System.out.println(msg);
System.out.println("End");

}
}
