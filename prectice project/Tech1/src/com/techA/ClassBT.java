package com.techA;

public class ClassBT
{
int x;// instance 
static int y;//static
ClassBT()
{
	x++;
	y++;
	
	System.out.println("instance varable x: "+ x);
	System.out.println("static varable y: "+ y);
}
public static void main(String[] args)
{
new ClassBT();
System.out.println("-------------");
new ClassBT();
System.out.println("-------------");
new ClassBT();


}	

}
