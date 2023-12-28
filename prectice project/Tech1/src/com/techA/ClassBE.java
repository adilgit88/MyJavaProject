package com.techA;

public class ClassBE
{
void meth1()
{
	int x=10;
	int y=20;
	int z=x++ + ++x;//z=10+12=22
	System.out.println("z :"+z);
	System.out.println("x :"+x);
	
	int i=++y + ++y;//i=21 +22=43
	System.out.println("i :"+i);
	System.out.println("y :"+y);
	
	
}
	public static void main(String[] args) {
		ClassBE abcd=new ClassBE();
		abcd.meth1();
	}
}
