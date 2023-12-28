package com.techA;

public class ClassBD
{
void meth1()
{
	int x=10;
	System.out.println(++x);// 11 x=11
	System.out.println(x++);//11  x=11
	System.out.println(x);//12   x=12
	x++;//x=13
	System.out.println(x++);// 13 x=13
	System.out.println(x--);//14 x=14
	--x;//x=12
	System.out.println(x--);//12 x=12
	System.out.println(++x);//12 x=12
	System.out.println(++x);//13 x=13
	x--;//x=12
	System.out.println(x--);//12 x=12
	++x;//x=12
	System.out.println(x++);//12 x=13
	System.out.println(++x);//14 x=14
	System.out.println(x);//x=14 
	
}
public static void main(String[] args)
{
ClassBD abcd=new ClassBD();
abcd.meth1();
}

}
