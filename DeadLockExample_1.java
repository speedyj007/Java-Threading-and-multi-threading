
public class DeadLockExample_1{
	public static void main(String []args)
	{
		final String res1 = "Ratan Tata";
		final String res2 = "Mukesh Ambani";
		
		Thread t1 = new Thread()
		{
		public void run()
		{
			synchronized(res1)
			{
				System.out.println("Thread 1 locked : res1");
				
				try{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				synchronized(res2)
				{
					System.out.println("Thread 1 locked : res2");
				}
			}
		}
		
	};
	
	Thread t2 = new Thread()
	{
	public void run()
	{
		synchronized(res2)
		{
			System.out.println("Thread 2 locked : res2");
			
			try{
				Thread.sleep(1000);
				
			}
			catch(Exception ev)
			{
				System.out.println(ev);
			}
			synchronized(res1)
			{
				System.out.println("Thread 2 locked : res1");
			}
	
		}
		}
	};
	
	t1.start();
	t2.start();
}
}