package com.techA;

public class ClassAK
{
	public String testMethod()
	{
		System.out.println(35);
		
		return new ClassAK().testMethod3(new ClassAK().testMethod2())+new ClassAK().testMethod4("Here");
	}
	public int  testMethod2()
	{
		System.out.println(25);
		return 25+5;
		
	}
	public String testMethod3(int a)
	{
		System.out.println(15);
		return "is";
		
	}
	public String testMethod4(String s)
	{
		System.out.println(45);
		return " Awesome";
	}
	public static void main(String[] args)
	{
		ClassAK t=new ClassAK();
		System.out.println("Java " +t.testMethod());
	}
	
	
}