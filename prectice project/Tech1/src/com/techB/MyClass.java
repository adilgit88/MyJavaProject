package com.techB;

public class MyClass {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        
        // Example usage:
        int[] inputArray1 = {1, 2, 3};
        int result1 = myObj.meth3(inputArray1);
        System.out.println(result1); // Output: 3
        
        int[] inputArray2 = {5, 5};
        int result2 = myObj.meth3(inputArray2);
        System.out.println(result2); // Output: 10
        
        int[] inputArray3 = {8, 2, 1, 4};
        int result3 = myObj.meth3(inputArray3);
        System.out.println(result3); // Output: 10
        
        int[] emptyArray = {};
        int resultEmpty = myObj.meth3(emptyArray);
        System.out.println(resultEmpty); // Output: 0
    }

    int meth3(int[] arr) {
        // Check if the array length is 0
        if (arr.length == 0) {
            return 0;
        }
        
        // Check if the array length is less than 2
        if (arr.length < 2) {
            // Sum up the elements that exist
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
        } else {
            // Sum of the first 2 elements in the array
            return arr[0] + arr[1];
        }
    }
}

