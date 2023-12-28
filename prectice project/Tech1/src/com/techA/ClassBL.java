package com.techA;

public class ClassBL 
{
public static void main(String[] args) 
{
	int a=34;// a=34
	int b=21;//b=21 a=34
	int c=a++ + ++b;//c=56 a=35 b=22
	int d=--a + --b + c--;//d=34-21+56=-43 a=34 b=21 c=55
	int e=a + + b + + c + d--;//e=34+21+55+(-43)=67 a=34 b=21 c=55 d=-44
	int f=-a + b-- +- c - d++;//f=(-34)+21+(-55)-(-44)=-24   a=34 b=20 c=55 d=-43 e=-43
	int sum= a+b+c+d+e+f;//sum= 34+20+55+(-43)+(-43)+(-24)=-1
	System.out.println("sum ="+sum);//sum =-1

}
	
}
