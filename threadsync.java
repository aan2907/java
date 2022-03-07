class thread
{
	public synchronized void display(int n)
	{
		for(int i=n;i<=100;i+=2)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(40);
			}
			catch(Exception e)
			{
				continue;
			}
		}
	}
}
class Even extends Thread
{
	thread obj;
	Even(thread obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.display(2);
	}
}
class Odd extends Thread
{
	thread obj;
	Odd(thread obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		obj.display(1);
	}
}
public class threadsync
{
	public static void main(String[] args)
	{
		thread obj=new thread();
		Even objEven=new Even(obj);
		Odd objOdd=new Odd(obj);
		objEven.start();
		objOdd.start();
	}
}