package com.techA;

public class ClassDQ 
{
void meth1()
{
	System.out.println("Implementing String Handling"+"\n");
	String s1="java";
	String s2=new String("java");
	char arr[]= {'j','a','v','a'};
	String s3=new String (arr);
	String s4=new String(arr,1,1);
	
	System.out.println("s1 :"+s1);
	System.out.println("s2 :"+s2);
	System.out.println("s3 :"+s3);
	System.out.println("s4 :"+s4);
}
void meth2()
{
	System.out.println("Strig which were created by using Stirn class are immutable");
	String s="java";
	System.out.println("before s value :"+s);
	
	System.out.println(s.concat("is awesome"));
	//s=s.concat("is awesome");
	System.out.println("after s value :"+s);
	
}
public static void main(String[] args) 
{
ClassDQ aobj=new ClassDQ();
aobj.meth1();
aobj.meth2();
	
}
}
