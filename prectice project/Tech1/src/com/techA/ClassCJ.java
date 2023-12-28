package com.techA;

public class ClassCJ 
{
void autoBoxing()
{
	System.out.println("Implementing Auto-boxing");
	int i=10;
	Integer ival1=i;
	Integer ival2=new Integer(i);
	Integer ival3=Integer.valueOf(i);
	
	System.out.println("int PDT i;"+i);
	System.out.println("int WCO inval1;"+ival1);
	System.out.println("int WCO inval1;"+ival2);
	System.out.println("int WCO inval3;"+ival3+"\n");
	
	char c='A';
	Character cval1=Character.valueOf(c);
	Character cval2=new Character(c);
	System.out.println("Char PDT c: "+c);
	System.out.println("Character WCO cval1 :"+cval1);
	System.out.println("Character WCO cval2 :"+cval2+"\n");

	float f=10.99f;
	Float fval1=Float.valueOf(f);
	Float fval2=new Float(f);
	System.out.println("Float PDT f: "+f);
	System.out.println("Float WCO cval1 :"+fval1+"\n");


}
void autoUnboxing()
{
	System.out.println("Implementing Auto-unboxing");
	Byte bval=new Byte((byte)50);
	byte b1=bval;
	byte b2=bval.byteValue();
	System.out.println("byte WCO bval : "+bval);
	System.out.println("byte PDT b1 :"+b1);
	System.out.println("byte PDT b2 :"+b2);
	
	
	Long lval=new Long(5000);
	Long l=lval.longValue();
	System.out.println("long WCO lval: "+lval);
	System.out.println("long PDT 1 :"+l+"\n");
	
	
	
	Character cval=new Character((char)65);
	char c=cval.charValue();
	
	System.out.println("Character WCO cval :"+cval);
	System.out.println("Character PDT c :"+c+"\n");


	
	
	
	
	
	
}

void meth1()
{
	System.out.println("meth1() called");
	Integer ival1=new Integer(500);
	Integer ival2=new Integer("100");
	//integer ival3=new Integer("java");//it generates Numberformate exception
	System.out.println("ival 1:"+ival1);
	System.out.println("ival2: "+ival2);
	//System.out.println("inval2: "+ival3);
	
	Boolean booleanval=new Boolean("true");
	System.out.println("booleanval :"+booleanval);
	
	
	
	//Character cval=new Character("java");
	
	
}
public static void main(String[] args)
{
	ClassCJ abcd=new ClassCJ();
	abcd.autoBoxing();
	System.out.println("_----------------");
	abcd.autoUnboxing();
	System.out.println("------------------");
	abcd.meth1();
}

}
