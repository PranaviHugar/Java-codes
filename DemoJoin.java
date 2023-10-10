class NewThread extends Thread
{
	String name;//name of thread
	NewThread(String Threadname)
	{
    	name=Threadname;
    	System.out.println("New Thread:"+this);
    	start();//start the thread
	}//this is entry point for thread
	public void run()
	{
    	try
    	{
        	for(int i=5;i>0;i--)
        	{
            	System.out.println(name+":"+i);
            	Thread.sleep(1000);
        	}
    	}
    	catch(InterruptedException e)
    	{
        	System.out.println(name+"interrupted");
    	}
    	System.out.println(name+"exiting");
	}
}

class DemoJoin
{
	public static void main(String args[])
	{
    	NewThread ob1=new NewThread("One");
    	NewThread ob2=new NewThread("Two");
    	NewThread ob3=new NewThread("Three");
    	System.out.println("Thread one is alive:"+ob1.isAlive());
    	System.out.println("Thread two is alive:"+ob2.isAlive());
    	System.out.println("Thread three is alive:"+ob3.isAlive());
    	try
    	{
        	ob1.join();//suspends currnt thread until thread on which it was called finishes execution
        	ob2.join();
        	ob3.join();
    	}
    	catch(InterruptedException e)
    	{
        	System.out.println("Main Thread Interrupted");
    	}
    	System.out.println("Thread one is alive:"+ob1.isAlive());//returns boolean value
    	System.out.println("Thread two is alive:"+ob2.isAlive());
    	System.out.println("Thread three is alive:"+ob3.isAlive());
    	System.out.println("Main thread is exiting");
	}
}
