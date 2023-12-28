package com.techA;

public class ClassAO 
{
	void meth1()
	{
		System.out.println("met1() called");
		
	}
	public static void main(String[] args)
	{
	ClassAO abcd1=new ClassAO();//1st object
	ClassAO abcd2=new ClassAO();//2nd object
	
	int abcd1_hashCode=abcd1.hashCode();
	int abcd2_hashCode=abcd2.hashCode();
	
	System.out.println("abcd1 :"+ abcd1_hashCode);
	System.out.println("abcd2 :"+ abcd2_hashCode+"\n");
	
	System.out.println(abcd1.equals(abcd2));
	System.out.println(abcd1.equals(abcd1));
	System.out.println(abcd2.equals(new ClassAO()));
	System.out.println(new ClassAO().equals(new ClassAO()));
	
	}
	
}

/*
 hashCode():
1. The return type for hashCode() is int
2. hashcode() does not provides the  address location of an object 
3. it is going t generate a unique identification number  for your objects which is used to distiguish two different objects separately.

equals():
1. the return type for equals() is boolean (either true/ false)
2. equals() is going to compare the address locations of the objects
3. if both the objects are present in the same address location then equals()
4. is going to return 'true' otherwise 'false'.
*/
