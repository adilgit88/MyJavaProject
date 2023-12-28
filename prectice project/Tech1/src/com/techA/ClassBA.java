package com.techA;

public class ClassBA 

{
String patientName;
int patientroom;
int patientID;

static String patienthospital="North Westurn";//static variable are used
								// for declaring common properties of a class
ClassBA(String Name, int room, int ID)
{
	patientName=Name;
	patientroom=room;
	patientID=ID;
	
	
}
public static void main(String[] args)
{
ClassBA abc1=new ClassBA("xyz1", 201, 1001);
ClassBA abc2=new ClassBA("xyz2", 202, 1002);
ClassBA abc3=new ClassBA("xyz3", 203, 1003);

System.out.println(abc1.patientName+" "+abc1.patientroom+" "+abc1.patientID+" "+ClassBA.patienthospital);
System.out.println(abc2.patientName+" "+abc2.patientroom+" "+abc2.patientID+" "+ClassBA.patienthospital);
System.out.println(abc3.patientName+" "+abc3.patientroom+" "+abc3.patientID+" "+ClassBA.patienthospital+"\n");





abc1.patientroom=204;


System.out.println(abc1.patientName+" "+abc1.patientroom+" "+abc1.patientID+" "+ClassBA.patienthospital);
System.out.println(abc2.patientName+" "+abc2.patientroom+" "+abc2.patientID+" "+ClassBA.patienthospital);
System.out.println(abc3.patientName+" "+abc3.patientroom+" "+abc3.patientID+" "+ClassBA.patienthospital+"\n");

abc1.patientName="xyz4";
abc2.patientName="xyz5";
abc3.patientName="xyz6";
abc3.patienthospital="South Westurn";



System.out.println(abc1.patientName+" "+abc1.patientroom+" "+abc1.patientID+" "+ClassBA.patienthospital);
System.out.println(abc2.patientName+" "+abc2.patientroom+" "+abc2.patientID+" "+ClassBA.patienthospital);
System.out.println(abc3.patientName+" "+abc3.patientroom+" "+abc3.patientID+" "+ClassBA.patienthospital+"\n");
}



	
}