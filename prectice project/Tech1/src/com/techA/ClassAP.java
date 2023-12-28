package com.techA;

public class ClassAP 
{
	void meth1()
	{
		System.out.println("meth1() called");
		
	}
	public static void main(String[] args)
	{
	ClassAP abcd1=new ClassAP();//1st object
	ClassAP abcd2=new ClassAP();//2nd object
	
	
	System.out.println("abcd1 : "+ abcd1);//internally calls toString()
	System.out.println("abcd1:" + abcd1.toString());
	
	System.out.println("_____________________");
	
	System.out.println("abcd2: " + abcd2);//internally calls toString
	System.out.println("abcd2: "+ abcd2.toString());
	
	System.out.println("____________________");
	
	System.out.println("getClass() :" +abcd1.getClass());
	System.out.println("getClass():" + abcd2.getClass());
	

	
	}

}




/*
toString():
1. The return type for toString() is String.
2. it is used to convert an object ion to a String format
public String to String()
{ 
return getClass().getName90 ="@" + Integer.tohexString(hasgCode)):
}
3. whenever we are printing a class object it will internally call toString().

get class():
1. it IS going t provide FULLY QUALIFIED CLASSNAME.

*/