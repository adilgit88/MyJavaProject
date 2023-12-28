package com.techA;

public class ClassBQ
{

void exameligibility(String name, int age)//age 21-35
{
	if (age>=21 && age<=35)
	//if (!(age>=21 || age<=35))//T || F ===> !(true) ===> False
	{
		System.out.println(name +" eligible for exam");
		
	}
	else 
	{
		System.out.println(name +" not eligibile for exam ");
	}
}


public static void main(String[] args)
{
	ClassBQ abcd=new ClassBQ();
	abcd.exameligibility("adil", 24);
	
}
	
}
