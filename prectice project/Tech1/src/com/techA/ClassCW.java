package com.techA;

public class ClassCW 
{
 void display()
 {
	 int a=10;
	 for(int k=(a++)+(++a)+(++a);k>10;k++)
	 {
		System.out.println(k);
		break;
	 }
 
 }
public static void main(String[] args) {
	ClassCW a=new ClassCW();
	a.display();
}
}

