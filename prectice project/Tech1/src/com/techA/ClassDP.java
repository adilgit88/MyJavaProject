/*
 * Given an int array, return a new array with
double the length where its last element is
the same as the original array, and all the
other elements are 0. The original array
will be length 1 or more.

makeLast([4, 5, 6]) ? [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) ? [0, 0, 0, 2]
makeLast([3]) ? [0, 3]

public int[] makeLast(int[] nums)
{
// write your logic here

}
Don't change the Syntax sigh
 */


package com.techA;

import java.util.Arrays;

public class ClassDP 
{
	public int[] makeLast(int[] nums)
	{
	    int[] result = new int[nums.length * 2];
	    result[result.length - 1] = nums[nums.length - 1];
	    return result;
	}

	
	public static void main(String[] args)
	{
		ClassDP aobj=new ClassDP();
		int input1[]= {4,5,6};
		int input2[]= {1,2};
		int input3[]= {3};
		int result1[]=aobj.makeLast(input1);
		int result2[]=aobj.makeLast(input2);
		int result3[]=aobj.makeLast(input3);
		System.out.println(Arrays.toString(result1)); 
		System.out.println(Arrays.toString(result2)); 
		System.out.println(Arrays.toString(result3)); 
	}
}
