package com.techA;

public class ClassBO
{
void meth1(int a, int b, int c)
{
	System.out.println("Addition:"+(a+b+c));
	new ClassBO().meth2(90, 89);
}
void meth2(int a, int b)
{
	System.out.println("Substraction :"+ (a-b));
	
}
ClassBO()
{
	System.out.println("Division :"+ (100/2));

}
ClassBO(int x)
{
	System.out.println("multiplication :"+(x*10));
}
public static void main(String[] args)
{
new ClassBO(25).meth1(5, 10, 15);	
}
}
