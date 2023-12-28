package com.techA;

public class ClassBG
{
void meth1()
{
	int x=10;// x=10
	int y=x++;//y=10 x=11
	int z=y++ + ++x +10;//z=10+12+10=32 y=11 x=12 
	
	int result=x++ + ++y + z++ + 50;//result=12+12+32+50=106
System.out.println(result++);//106 result=107
System.out.println(result++);//107 result=108
System.out.println(result++);//108 result=109
System.out.println(result+x+++y+z+++(++result));//109+13

System.out.println("x :"+x);
System.out.println("y :"+y);
System.out.println("z :"+z);
System.out.println("result :"+result);


}

	
public static void main(String[] args) {
	ClassBG abcd=new ClassBG();
	abcd.meth1();
}
}
