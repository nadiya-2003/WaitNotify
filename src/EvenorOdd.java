
public class EvenorOdd implements Runnable {

	static int count=1;
	Object obj;
	public EvenorOdd(Object obj)
	{
		super();
		this.obj=obj;
	}
	@Override
	public void run() {
		
			while(count<=10)
			{
				if(count%2==0 && Thread.currentThread().getName().equals("Even"))
				{
					synchronized(obj)
					{
						System.out.println("Thread name:"+Thread.currentThread().getName()+" Value:"+count);
						try
						{
						 Thread.sleep(2000);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
					    }
						count++;
						try
						{
							obj.wait();
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
				}
				}
				if(count % 2!=0 && Thread.currentThread().getName().equals("Odd") && count<=10)
				{
					synchronized(obj)
					{
						System.out.println("Thread name:"+Thread.currentThread().getName()+" Value:"+count);
						try
						{
						Thread.sleep(2000);
						}
						catch(InterruptedException e)
						{
						e.printStackTrace();
					}
						count++;
				try
				{ 
					obj.notify();
				}
	
		       catch(Exception e)
				{
		    	   e.printStackTrace();
				}
					}
				
				}
			}
	}
	}
			
	

		


