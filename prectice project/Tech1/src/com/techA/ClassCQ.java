package com.techA;

import java.security.DomainCombiner;

public class ClassCQ 
{
void meth1(int a, int b, char operator)
{
	switch(operator)
	{
	case '+':
		System.out.println("Addition :"+(a+b));
		break;
	case '-':
		System.out.println("Substraction :"+(a-b));
		break;
	case '*':
		System.out.println("Multiplication :"+(a*b));
		break;
	case '/':
		System.out.println("Division :"+(a/b));
		break;
	default:
		System.out.println("in valid input");
		
	}


}
public static void main(String[] args) 
{
new ClassCQ	
}
}
