package com.techA;

public class ClassAR 
{
public String meth1()
{
	//System.out.println("meth1() String");
	//System.out.println(A);
		
	return "ADD";
	
}
public int meth2()
{
	//System.out.println("meth2() int");
	//System.out.println(X);
	//System.out.println(Y);
	
	return 70;
	
}

public String meth3(String K, int L)
{
	//System.out.println("meth3() String");
	
	
	
	
	return "Methods";
}
public int meth4(String H, int I)
{
	
	
	
	
	return I;
}
public static void main(String[] args)
{
	ClassAR abc=new ClassAR();
	abc.meth1();
	String msg=abc.meth3(abc.meth1(),abc.meth2());
	System.out.println(msg);
	
	
	
}





}
