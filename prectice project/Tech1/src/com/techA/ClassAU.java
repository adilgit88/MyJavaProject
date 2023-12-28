package com.techA;



public class ClassAU 
{
	int i;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean flag;
	
	void meth1()
	{
		System.out.println("printing the default value if the datatype");

		System.out.println("int vaue :"+ i);
		System.out.println("byte vaue :"+ b);
		System.out.println("short vaue :"+ s);
		System.out.println("long vaue :"+ l);
		System.out.println("float vaue :"+ f);
		System.out.println("double vaue :"+ d);
		System.out.println("char vaue :"+ c);
		System.out.println("boolean vaue :"+ flag);
		
	
}
void meth2() 
{
	System.out.println("meth2() called");
	int i1=10;
	int i2=20;
	int i3=i1+i2;
	System.out.println("i3 :" + i3);
	
	byte b1=10;
	byte b2=10;// byte range :-128 to 127
	byte b3=(byte)(b1+b2);//type casting 10+10=20
	System.out.println("b3:" +b3);
	// every number in java is consider as int by the default
	float f= 10.9f;
	//every decimal value in java is considerd as double by default
	System.out.println("f :"+f);
	
	long x=2147483648l;
	System.out.println("x:"+ x);
	
	
}
public static void main(String[] args)
{
ClassAU abc=new ClassAU();
abc.meth1();
abc.meth2();

}

}
