package com.techA;

public class ClassDL 
{
	public boolean sameFirstLast(int[] nums)
	{
	    return nums.length >= 1 && nums[0] == nums[nums.length - 1];
	}
public static void main(String[] args) 
{
ClassDL aobj=new ClassDL();
int input[]= {5};
boolean result=aobj.sameFirstLast(input);
System.out.println(result);
	
}
}
