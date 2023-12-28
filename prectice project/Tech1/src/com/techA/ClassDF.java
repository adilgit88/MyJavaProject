package com.techA;

import java.util.Arrays;

public class ClassDF 
{
	int[] meth1()
	{
		int arr[]= {2,4,2};
		for (int i=0;i<arr.length-1;i++)
		{
			if (arr[i]==2 && arr[i+1]==3)
			{
				arr[i+1]=0;
			}
		}
		
		return arr;
	}
public static void main(String[] args) 
{
ClassDF aobj= new ClassDF();
int result[]=aobj.meth1();
System.out.println(Arrays.toString(result));


}
}