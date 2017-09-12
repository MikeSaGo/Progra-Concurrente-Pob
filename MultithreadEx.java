import java.io.*;
class Thread1 extends Thread
{
	private int lim;

	public Thread1(int lim)
	{
		this.lim = lim;
	}

	public void run()
	{
		for(int i=1;i<=lim;i++)
		{
			System.out.println("thread 1 = "+i);
		}
		System.out.println("Thread 1 termino");
	}
}

class Thread2 extends Thread
{
	private int lim;

	public Thread2(int lim)
	{
		this.lim = lim;
	}

	public void run()
	{
		for(int i=10;i>lim;i--)

		{
			System.out.println("thread 2 =\t"+i);
		}
		System.out.println("          \tThread 2 termino");
	}
}

public class MultithreadEx
{
	public static void main(String[] args) 
	{
		Thread1 thread1 = new Thread1(5);
		Thread2 thread2 = new Thread2(5);
		thread1.start();
		thread2.start();

	}
}