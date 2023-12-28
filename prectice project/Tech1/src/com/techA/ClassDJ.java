package com.techA;

public class ClassDJ 
{
int meth3(int []arr)
{
	if (arr.length>=2)
		return arr[0]+arr[1];
	else if(arr.length==1)
		return arr[0];
	else
		return 0;
}
public static void main(String[] args) 
{
ClassDJ aobj=new ClassDJ();
int result=aobj.meth3(new int[] {5000});
System.out.println(result);
}
}
