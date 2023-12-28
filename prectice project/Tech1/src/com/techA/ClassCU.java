package com.techA;

import java.util.Scanner;

public class ClassCU 
{
	static Scanner sc=new Scanner(System.in);
	void meth1()
	{
		
		System.out.println("Employee Detail ");
		
		System.out.print("Enter Your First name:");
		String firstname=sc.next();
		System.out.println("First name:"+firstname);
		System.out.print("Enter Your Last name:");
		String lastname=sc.next();
		System.out.println("Last name:"+lastname);
		System.out.print("Enter your ID :");
		int id=sc.nextInt();
		System.out.println("ID :"+id);
		
		System.out.print("Enter Your Address:");
		String add=sc.nextLine();
		String address=sc.nextLine();
		
		System.out.print("Enter Your Address:" + address);
		
		
		
		
		}	
public static void main(String[] args)
{
	new ClassCU().meth1();

}

}


