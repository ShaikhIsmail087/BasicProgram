import java.io.*;
class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
class CastException extends Thread
{
	public void run()throws ClassCastException
	{
		System.out.println("i am thread run");
	}
	public static void main(String[] args)throws Exception
	{
		Thread t=new Thread();
		t.start();
		t.run();
		try
		{
			for(int i=1;i<=5;i++)
			{
				Thread.sleep(3000);
				System.out.println("i am sleeping "+i);
			}
		}
		catch(ClassCastException | NullPointerException e)
		{
			//e.printStackTrace();
		}
		/*int age=Integer.parseInt(args[0]);
		if(age<21)
		{
			throw new TooYoungException("plz wait some more time...you will get best match soon");
		}
		else if(age>60)
		{
			throw new TooOldException("your age is already crossed marriage age...no chance of getting  marriage");
		}
		else
		{
			System.out.println("you will get match details soon by email...!");
		}*/
	}
}