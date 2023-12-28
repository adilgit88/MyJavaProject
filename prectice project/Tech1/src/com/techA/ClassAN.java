package com.techA;

public class ClassAN {

    int meth1(int x, int y)
    {
        // Some logic using parameters
        return x + y;
    }

    int meth2(int a, int b)
    {
        // Some logic using parameters
        return a * b;
    }

    String meth3(String str, int n) {
        // Some logic using parameters
        return "Java";
        
    }
      

    public static void main(String[] args) {
        ClassAN abcd = new ClassAN();

        // Call only one method from main and use the returned value
        int result = abcd.meth1(5, 10);
        System.out.println("Result of meth1: " + result);
    }
}
