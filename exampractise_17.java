
public class exampractise_17{
	public static void main(String []args)
	{	
class table_4{


	void printTable_3(int n)
	{
	synchronized(this)
	{

			System.out.println();
			
		for(int i = 1;i<=5;i++)
		{
			System.out.println("The Number : "+n*i);
			
			try{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
		}
		System.out.println();
		System.out.println("The Thread is existing.");
			}	
			}
}


	final table_4 obj = new table_4();
		
		Thread t1 = new Thread()
		{
			public void run()
			{

			
				System.out.println();
				System.out.println("Thread is running successfully.");
				System.out.println();
				
				
			
			}
			
		};

		Thread t2 = new Thread()
		{
			
			public void run()
			{
				obj.printTable_3(2);
			}
		};	
		
		
		t2.start();
		t1.start();
	}
}