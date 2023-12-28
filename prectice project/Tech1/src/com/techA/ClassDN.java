/*
 * Given an array of ints length 3, return the
sum of all the elements.

sum3([1, 2, 3]) ? 6
sum3([5, 11, 2]) ? 18
sum3([7, 0, 0]) ? 7

public int sum3(int[] nums)
{
// write your logic here

}
don't change the Syntax sigh
 */


package com.techA;

public class ClassDN 
{
	public int sum3(int[] nums) {
	    return nums[0] + nums[1] + nums[2];
	}
public static void main(String[] args) 
{
	ClassDN aobj=new ClassDN();
	int input1[]= {5,11,2};
	int result=aobj.sum3(input1);
	System.out.println(result); 
}
}
