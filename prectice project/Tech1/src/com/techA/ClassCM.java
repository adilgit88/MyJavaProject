package com.techA;

public class ClassCM 
{
void bill(int units)
{
	int finalBill=units*100;
	if(finalBill>1000)
	{
		int discount=(finalBill*10)/100;
		System.out.println("your final Bill is :"+(finalBill-discount));
		System.out.println("Congratulations!!! you Saved "+ discount);
		
	}
	else
	{
		System.out.println("your final Bill is :"+finalBill);
		System.out.println("shop more"+(1000-finalBill)+"to receive a discount of 10%");
	
	}
	
}
public static void main(String[] args) {
	new ClassCM().bill(7);
}
}

