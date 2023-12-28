package com.techA;

public class ClassCY 
{
	

	    static void printNumbers(int start, int end) {
	        if (start <= end) {
	            System.out.println(start);
	            printNumbers(start + 1, end);
	        }
	    }

	    public static void main(String[] args) 
	    {
	        
	        printNumbers(1, 100);
	    }
	}

	

