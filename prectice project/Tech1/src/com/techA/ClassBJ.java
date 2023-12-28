package com.techA;

public class ClassBJ 
{
int meth1()
{
int a=10;//a=10
a++;//a=11
System.out.println(a++);//11  a=12
a++;//a=13
System.out.println(++a);//14 a=14
System.out.println(a++);//14 a=15
System.out.println(a++);//15 a=16
a--;//a=15
System.out.println(--a);//14 a=14
a=a++ +3;//17 a=17
System.out.println("a value ==>"+a);//a value a=17

System.out.println(a++);//17 a=18
--a;//a=17
System.out.println(--a);//16 a=16
System.out.println(a--);//16 a=15
a=a-- +3;//a=18
return a++ + ++a;//38

}
void meth2()
{
	int a=10;//a=10
	int x=new ClassBJ().meth1()+ a++;//38 +10 =48 a=11
	System.out.println(x++ + a++);// 48+11==>59 x=49  a=12
	System.out.println(a++);//12 a=13
	System.out.println(a);//13
	System.out.println(x);//49
	
	
}


public static void main(String[] args)
{
	System.out.println("start");
	new ClassBJ().meth2();
	System.out.println("Java is awesome");
	
}
}
