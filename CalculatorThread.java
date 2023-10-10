class add extends Thread
{
	public void run()
	{
    	for(int i=0;i<5;i++)
    	{
        	System.out.println("sum="+(i+i));
        	try
        	{
            	Thread.sleep(1000);
        	}
        	catch(InterruptedException ex){}
    	}
    	System.out.println("add thread exiting");
	}
}
class subtract extends Thread
{
	public void run()
	{
    	for(int i=0;i<5;i++)
    	{
        	System.out.println("diff="+(i-i));
        	try
        	{
            	Thread.sleep(1000);
        	}
        	catch(InterruptedException ex){}
    	}
    	System.out.println("subtract thread exiting");
	}
}
public class CalculatorThread
{
	public static void main(String args[])
	{
    	add a=new add();
    	subtract s=new subtract();
    	a.setPriority(10);
    	s.setPriority(1);
    	a.start();
    	s.start();
    	Thread.State ts=a.getState();
    	System.out.println("addition thread state:"+ts.toString());
	}
}

