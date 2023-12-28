package com.techA;

public class ClassCB 
{
static int x =10;
public static void main(String[] args) 
{
	ClassCB t1 = new ClassCB();
	ClassCB t2 = new ClassCB();
	
	t1.x =20;
	System.out.print(x+ " ");
	System.out.println(t2.x);
	
}


}
