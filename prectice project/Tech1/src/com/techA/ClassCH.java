package com.techA;

public class ClassCH 
{
String meth1(int a, int b, int c, int d)
{
	if(a<=10)
	{
		System.out.println("hi");
		if((a+b)== 50)
		return "hi";
		return "Hello";
	}
	else 
	{
		if(c>=a)
		{
			if(true)
				return "Tuesday";
				return "Wednesday";
		}
		else
		{
			if(d>0)
				System.out.println(d+"is a positive number");
			else if(d<0)
				System.out.println(d+"is a nagative number");
			else
				System.out.println(d+"equal to zero");
			return "Java";
	
	}
}
}
public static void main(String[] args)
{
ClassCH bobj=new ClassCH();
String result = bobj.meth1(15, 18, 46, 14);
System.out.println("meth1() is returning ====> "+ result);
}
}
