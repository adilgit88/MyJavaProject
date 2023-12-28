package com.techA;

public class ClassBH
{
void meth1()
{
	int x=10;// x=10
	int y=x++;//y=10 x=11
	int z=y++ + ++x +10;//z=32 
	
	
	System.out.println("x:"+x);
	System.out.println("y:"+y);
	System.out.println("z:"+z);
	
	
	int result=x++ + ++y + z++ + 50;//result : 106
	
	System.out.println(result++);
	System.out.println(result++);
	System.out.println(result++);
	System.out.println(result+x+++y+z+++(++result));

	System.out.println("x :"+x);
	System.out.println("y :"+y);
	System.out.println("z :"+z);
	System.out.println("result :"+result);


}

	
public static void main(String[] args) {
	ClassBH abcd=new ClassBH();
	abcd.meth1();
}
}
