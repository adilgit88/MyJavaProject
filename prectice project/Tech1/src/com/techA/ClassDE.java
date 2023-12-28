package com.techA;

public class ClassDE 
{

    char[] meth1(int arr[], String[] day, String msg) 
    {
        
        char[] result = { 'a', 'b', 'c' };
        return result;
    }

    public static void main(String[] args) {
        ClassDE aobj = new ClassDE();
        
        char[] result = aobj.meth1(5, new String[] { "4" }, "HI");
        System.out.println(result);
        
      
        }
    }

//please fix the issue . 