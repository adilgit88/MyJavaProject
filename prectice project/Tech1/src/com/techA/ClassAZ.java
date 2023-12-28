package com.techA;

public class ClassAZ 
{
String empName;
int empID;
String empDept;

static String empcompany="TCS";//static variable are used
								// for declaring common properties of a class
ClassAZ(String name, int ID, String dept)
{
	empName=name;
	empID=ID;
	empDept=dept;
	
}
public static void main(String[] args)
{
ClassAZ abc1=new ClassAZ("adil", 101,"java");
ClassAZ abc2=new ClassAZ("patel", 102,"aws");
ClassAZ abc3=new ClassAZ("nas", 103,"oracle");

System.out.println(abc1.empName+" "+abc1.empID+" "+abc1.empcompany);
System.out.println(abc2.empName+" "+abc2.empID+" "+abc2.empcompany);
System.out.println(abc3.empName+" "+abc3.empID+" "+abc3.empcompany+"\n");

abc1.empDept="Spring";


System.out.println(abc1.empName+" "+abc1.empID+" "+abc1.empcompany);
System.out.println(abc2.empName+" "+abc2.empID+" "+abc1.empcompany);
System.out.println(abc3.empName+" "+abc3.empID+" "+abc1.empcompany+"\n");

abc2.empcompany="HCL";

System.out.println(abc1.empName+" "+abc1.empID+" "+ClassAZ.empcompany);
System.out.println(abc2.empName+" "+abc2.empID+" "+ClassAZ.empcompany);
System.out.println(abc3.empName+" "+abc3.empID+" "+ClassAZ.empcompany+"\n");

}



	
}
