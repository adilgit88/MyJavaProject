package com.techA;

public class ClassBK 
{
void  meth1()
{
	int x=10;
	System.out.println("before x:"+x);
	x=x++;//x=10
	System.out.println("After x:"+x+"\n");
	int y=20;
	System.out.println("before y:"+y);
	int z=y++; // z=2- y=21
	System.out.println("after y:"+y);
	System.out.println("z value :"+z+"\n");
	
	int i=50;
	System.out.println("before i:"+i);
	i=i++ + ++i;//i=50+52=102
	System.out.println("after i:"+i+"\n");
	
	int k=100;
	System.out.println("before k:"+k);//100
	k=k++ +10;
	System.out.println("after k:"+k+"\n");//110

	int m=100;
	System.out.println("before m:"+m);//100
	m=++m +10;
	System.out.println("after m:"+m+"\n");//111
	
	
	
}
public static void main(String[] args) 
{
new ClassBK().meth1();	
}

}
