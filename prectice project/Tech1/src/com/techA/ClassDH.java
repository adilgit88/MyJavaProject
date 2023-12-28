package com.techA;

public class ClassDH 
{
int meth1(int[] arr)
{
	if(arr.length==0)
	{
		return 0;
	}
	if (arr.length<2)
	{
		int sum=0;
		sum += num;
	}
	return sum;
	}
	else 
{
	return arr[0]+arr[1];
}
public static void main(String[] args) 
{
	ClassDH aobj=new ClassDH();
	
	int[] inputArray1 = {1, 2, 3};
    int result1 = aobj.meth1(inputArray1);
    System.out.println(result1); // Output: 3
    
    int[] inputArray2 = {5, 5};
    int result2 = aobj.meth1(inputArray2);
    System.out.println(result2); // Output: 10
    
    int[] inputArray3 = {8, 2, 1, 4};
    int result3 = aobj.meth1(inputArray3);
    System.out.println(result3); // Output: 10
    
    int[] emptyArray = {};
    int resultEmpty = aobj.meth1(emptyArray);
    System.out.println(resultEmpty); // Output: 0	
}


}
