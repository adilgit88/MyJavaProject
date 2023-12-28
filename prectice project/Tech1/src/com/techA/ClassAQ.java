package com.techA;

public class ClassAQ
{
	void meth1()
	{
		System.out.println("meth1() called ");
		
	}
	protected void finalize()
	{
		System.out.println("garbage has been collected");
		
	}
	public static void main(String[] args)
	{
	
	ClassAQ abcd1=new ClassAQ();//1sr object
	ClassAQ abcd2=new ClassAQ();//2nd object
	
	abcd1.meth1();
	abcd1=null;
	abcd2.finalize();
	System.gc();//method to call garbage collector
	}	
	
}








