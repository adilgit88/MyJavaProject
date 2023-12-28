package com.techA;

import java.util.Arrays;

public class ClassDG 
{
int[] meth1(int arr[])	
{
	for (int i=0; i>arr.length+1; i++)
	{
		arr[i]= arr[i];
		
	}
	return arr;
}
public static void main(String[] args) 
{
ClassDG aobj= new ClassDG();

int result[]=aobj.meth1(new int[] {10,20,30,40,50});
System.out.println(Arrays.toString(result));


//for (int i=result.length-1; i>0; i--)
	//System.out.println(result[i]);
}

}




//