import java.util.concurrent.locks.*;
class Display
{
	ReentrantLock l=new ReentrantLock(true);
	public  void wish(String name)
	{
		l.lock();
		for(int i=0;i<10;i++){
			System.out.print("Good Morning:");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			System.out.println(name);
		}
		l.unlock();
	}
}

class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
	/*static Thread mt;
	public void run()
	{
			for(int i=0;i<10000;i++)
		{
			System.out.println("i am lazy thread-"+i);
		}
		System.out.println("i am entering sleeping state");
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("i got interrupted");
		}
	}*/
}
class MultiThreadDemo {

	public static void main(String[] args)throws InterruptedException {
		/*for(int i=1;i<=10;i++)
		{
		System.out.println("Slide-"+i);
		Thread.sleep(5000);
		}*/
		//MyThread.mt=Thread.currentThread();
		Display d1=new Display();
		//Display d2=new Display();
		MyThread t1=new MyThread(d1,"Dhoni");
		MyThread t2=new MyThread(d1,"YuvRaj");
		//t.setPriority(10);
		t1.start();
		t2.start();
		//t.interrupt();
		//t.yield();
		//t.join();
			//System.out.println("End of Main thread");
		
	}
}