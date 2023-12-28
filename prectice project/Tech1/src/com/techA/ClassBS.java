package com.techA;

public class ClassBS 
{
void meth1()
{
	int x=7;
	int  y=3;
	
	boolean isequal = x == y;//false
	boolean isgreatherthen = x > y;//true
	boolean islessthen = x < y;//false
	boolean isnotequal = x != y;//false
	
	System.out.println("is equal: "+isequal);
	System.out.println("is gratherthen: "+isgreatherthen);
	System.out.println("is lessthen: "+islessthen);
	System.out.println("is notequal: "+isnotequal+"\n");
}
	//evaluate the following code snippet
	void meth2()
	{
	
	boolean p= true, q=false;
	boolean logicaland=p && q;//
	boolean logicalor=p || q;
	boolean logicalanotp= ! q;
	boolean logicalnotq= ! q;
	
	System.out.println("logical and: "+logicaland);
	System.out.println("logical or: "+logicalor);
	System.out.println("logical not p: "+logicalanotp);
	System.out.println("logical not q: "+logicalnotq);
	
	}
	
	
public static void main(String[] args)
{
new ClassBS().meth1();	
new ClassBS().meth2();
}
}


