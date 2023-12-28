/*
 *Given an array of ints length 3, return an
array with the elements "rotated left" so
{1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) ? [2, 3, 1]
rotateLeft3([5, 11, 9]) ? [11, 9, 5]
rotateLeft3([7, 0, 0]) ? [0, 0, 7]

public int[] rotateleft3(int[] nums)
{
// write your logic here

}
don't hange the Syntax sigh
 */

package com.techA;

import java.util.Arrays;

public class ClassDO 
{
	public int[] rotateLeft3(int[] nums) 
	{
	    return new int[]{nums[1], nums[2], nums[0]};
	}
public static void main(String[] args)
{
	ClassDO aobj=new ClassDO();
	int input1[]= {1,2,3};
	int result[]=aobj.rotateLeft3(input1);
	System.out.println(Arrays.toString(result)); 
}
}
