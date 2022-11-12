import java.util.*;
import java.util.concurrent.*;

class Logic
{
	static Thread t1=new Thread();
    public static void main(String[] args)throws InterruptedException
	{
		Thread.currentThread().join();
		Runnable r=()->
		{
			try{
			t1.join();
			}catch(Exception e){}
		for(int i=1;i<=5;i++)
		{
		System.out.println("child thread "+i);
		}
		};
		Thread t=new Thread(r);
		t.join();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread "+i);
		}
    }
}
