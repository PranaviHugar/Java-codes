class ThrowDemo
{
	static void demoproc()
	{
    	try
    	{
        	throw new NullPointerException("demo");//Demo calls constructor of null point exception

    	}
    	catch(NullPointerException e)
    	{
        	System.out.println("Caught inside demoproc");
        	throw e;//rethrow exception
    	}
	}
	public static void main(String args[])
	{
    	try
    	{
        	demoproc();
    	}
    	catch(NullPointerException e)
    	{
        	System.out.println("Recaught:"+e);
    	}
	}
}
