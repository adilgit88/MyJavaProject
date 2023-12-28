package com.techA;

public class ClassCR 
{
	

	     void meth1(int limit) 
	     {
	        for (int i = 1; i <= limit; i++)
	        {
	            printTable(i);
	        }
	    }

	     void meth2(int start, int end)
	     {
	        if (start <= end) 
	        {
	            for (int i = start; i <= end; i++) 
	            {
	                printTable(i);
	            }
	        } 
	        else 
	        {
	            System.out.println("Invalid range: Start should be less than or equal to end.");
	        }
	    }

	   void printTable(int number) 
	   {
	        for (int i = 1; i <= 10; i++) 
	        {
	            System.out.println(number + " * " + i + " = " + (number * i));
	        }
	        System.out.println(); // Add a newline for better readability
	    }

	    public static void main(String[] args) 
	    {
	        System.out.println("Printing multiplication tables up to 5:");
	       // new ClassCR().meth1(5);

	        System.out.println("\nPrinting multiplication tables for numbers 2 to 6:");
	        new ClassCR().meth2(2, 6);
	    }
	}

	

