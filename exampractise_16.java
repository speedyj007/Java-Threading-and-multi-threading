
		
		class table_3{
			

				synchronized static void printTable_2(int n)
				{
					System.out.println();
					for(int i = 1;i<=5;i++)
					{
						System.out.println("The table of "+n+" * "+i+" = "+n*i);
						
						try{
							Thread.sleep(500);
							}
							catch(Exception e)
							{
								System.out.println(e);
							}
					}
				}
			
		}

public class exampractise_16{		
	public static void main(String []args)
	{			
		Thread t1 = new Thread()
		{
			public void run()
			{
				table_3.printTable_2(5);
			}
		};
		
		
		Thread t2 = new Thread()
		{
			public void run()
			{
				table_3.printTable_2(6);
			}
		};
		
			
		Thread t3 = new Thread()
		{
			public void run()
			{
				table_3.printTable_2(7);
			}
		};
		
		Thread t4 = new Thread()
		{
			public void run()
			{
				table_3.printTable_2(8);
			}
		};		
		
		t1.start();	
		t2.start();
		t3.start();
		t4.start();
	}
	 
}