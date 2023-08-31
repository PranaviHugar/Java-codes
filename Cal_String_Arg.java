class Cal_String_Arg
{public static void main (String args[])
	{	int a,b;
		char c;
		a=Integer.pareseInt(args[0]);
		b=Integer.pareseInt(args[2]);
		c=args[1].charAt(0);
		System.out.println("sum="+(a+b));
	}
}