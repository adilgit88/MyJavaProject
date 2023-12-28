package com.techA;

public class ClassCF 
{
int c;
static int e;
ClassCF()
{
	System.out.println("c value:"+ ++c);//c=1 c=2 c=3 c= c=14 c=14
	System.out.println("e value:"+ ++e);//e=1  e=1  e=1 e=1   e=1	e=1
}
public static void main(String[] args)
{
int a=34;
int b=21;
new ClassCF().c-=a++ + ++b;//c=34-22=12 c=12 a=35 b=22
int d=--a + --b +new ClassCF().c--;//d=34 + 21=13 d=13 13+ 13=0 c=12 a=34 b=21
e=a+b +b + +new ClassCF().c + d--;//e=34+21 +21 +  12 + 13=101 e=101 d=12 a=34 b=21 c=12 
int f=-a +b-- + -new ClassCF().c - d++;//f=-34 + 21+ 12 -12=11 f=12 a=34 b=20 c=12 d=13
int sum= a+b+new ClassCF().c + d+ e+ f;//34 + 20 + 12 + 13 + 101 + 11=191
System.out.println("sum="+sum);

}
}
