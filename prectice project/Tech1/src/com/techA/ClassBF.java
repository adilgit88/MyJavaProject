package com.techA;

public class ClassBF
{
void meth1()
{
	int x=10;
	int y=x++;
	int z=++x;

System.out.println("x : "+x);
System.out.println("y : "+y);
System.out.println("z : "+z);

}
	
public static void main(String[] args) {
	ClassBF abcd=new ClassBF();
	abcd.meth1();
}
}
