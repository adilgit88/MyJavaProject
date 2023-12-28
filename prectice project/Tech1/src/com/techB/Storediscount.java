package com.techB;
/*
 * clothing store offering on every 1st 2nd and 3rd day of the month discount buy $100 or 
 * more then $100 then get 20%, buy $200 or more then $200 then get 25%.


 */
public class Storediscount 
{
void mystore(int date, int totalamount)
{
	{
		//date=1;
		//date=2;
		//date=3;
	}
	if (100<=totalamount && 199>=totalamount && 1<=date && 3>=date)
	{
		int discount=(totalamount*20)/100;
		System.out.println("your bill is $"+totalamount);
		System.out.println("you are getting $"+discount+" Discount");
		System.out.println("your total bill is $"+(totalamount-discount)+", Thank you for shopping.");
		System.out.println("buy more $"+(200-totalamount)+" for 25% discount.");
				
		
	}
	else if(200<=totalamount && 1<=date && 3>=date)
	{
				
		int discount=(totalamount*25)/100;
		System.out.println("your bill is $"+totalamount);
		System.out.println("you are getting $"+discount+" Discount");
		System.out.println("your total bill is $"+(totalamount-discount)+", Thank you for shopping.");
				
		
		
		
	}
	else
	{
		
		System.out.println("buy more $"+(100-totalamount)+" for 20% discount.");
	}
	
}
public static void main(String[] args)
{
	new Storediscount().mystore(4, 100);
}

}
