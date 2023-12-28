/*
 * Given an array of int, return true if 6 appears as either the first or last element in
the array. The array will be length 1 or more.

firstLast6([1, 2, 6]) ? true
firstLast6([6, 1, 2, 3]) ? true
firstLast6([13, 6, 1, 2, 3]) ? false

public boolean firstLast6(int[] nums)
{
//write your logic here

}

don't change the syntax sigh

 */

package com.techA;

public class ClassDK 
{
	public boolean firstLast6(int[] nums) {
	    return nums.length >= 1 && (nums[0] == 6 || nums[nums.length - 1] == 6);
	}

public static void main(String[] args) 
{
ClassDK aobj=new ClassDK();
int input[]= {6,6,6};
boolean result=aobj.firstLast6(input);
System.out.println(result);
}
}
