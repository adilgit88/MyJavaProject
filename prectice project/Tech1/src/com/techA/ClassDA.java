package com.techA;

import java.util.Arrays;
public class ClassDA 
{
void meth1()
{
	System.out.println("Implementing Java Array");
	int arr1[];
	arr1=new int[3];
	int arr2[]=new int[5];
	int arr3[]= {512,5000,620,685};
	int arr4[]=new int[] {10,5,25,36,25,18};
	
	String s="Java";
	
	System.out.println("arr 1 length : "+ arr1.length);
	System.out.println("arr 2 length : "+ arr2.length);
	System.out.println("arr 3 length : "+ arr3.length);
	System.out.println("arr 4 length : "+ arr4.length);
	
	System.out.println("s length :"+ s.length()+"/n");
	
	System.out.println("arr 1 : "+ arr1);
	System.out.println("arr 2 : "+ arr2);
	System.out.println("arr 3 : "+ arr3);
	System.out.println("arr 4 : "+ arr4);
	
	System.out.println("arr 1 : "+ Arrays.toString (arr1));
	System.out.println("arr 2 : "+ Arrays.toString (arr2));
	System.out.println("arr 3 : "+ Arrays.toString (arr3));
	System.out.println("arr 4 : "+ Arrays.toString (arr4));
	
	arr2[1]=20;
	arr2[3]=40;
	
	System.out.println("arr2 : "+ Arrays.toString(arr2)+"/n");
	
	
	System.out.println(arr1[1]);
	System.out.println(arr3[3]);
	System.out.println(arr3[arr1.length-2]);
	System.out.println(arr4[arr3.length/arr1.length-1]);
	System.out.println(arr4[1]/20+"/n");
	
	System.out.println("retriving the data by using for the loop");
	
	for (int i=0; i<arr3.length; i++)

	{
		System.out.println(arr3[i]+  " ");
		
	}
	System.out.println();
	
	for (int i=arr3.length-1; i>=0; i--)
	{
		System.out.println(arr3[i]+ "  ");
	}
	System.out.println();
	
	System.out.println("Retriving the data by using feature loop");
	
	for(int x: arr3)
	{
		System.out.println(x + " ");
	}
	
	}

	public static void main(String[] args) 
	{
	ClassDA abcd=new ClassDA();
	abcd.meth1();
	}
	
}
