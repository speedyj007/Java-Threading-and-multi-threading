
public class exampractise_15{
	public static void main(String []args)
	{
		
		class table_2{
			
			void printTable_2(int n)
			{
				synchronized(this)
				{
					System.out.println();
					for(int i = 1;i<=5;i++)
					{
						System.out.println("The table of "+n+" * "+i+" = "+n*i);
						
						try{
							Thread.sleep(1000);
							}
							catch(Exception e)
							{
								System.out.println(e);
							}
					}
				}
			}
		}
		
		final table_2 t = new table_2();
		
		Thread t1 = new Thread()
		{
			public void run()
			{
				t.printTable_2(5);
			}
		};
		
		t1.start();	

		
	}
	 
}