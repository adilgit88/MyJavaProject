package com.techA;

public class ClassCT 
{
void meth1(int totalinventory, int puchases, int sale)
{
	System.out.println(totalinventory+puchases-sale+" in stock ");
}
public static void main(String[] args)
{
new ClassCT().meth1(100, 10, 5);	
}
}
