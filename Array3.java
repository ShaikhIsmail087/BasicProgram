
class Array3
{
	public static void main(String[] args)
	{
		try
		{
			try{
				try
				{
				System.out.println("going to divide by 0"); 
				int a=100,b=0,c;
				c=a/b;
				}
				catch(ArithmeticException e)
				{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println(e.getMessage());
				}
				try
				{
				int[] a=new int[5];
				a[5]=30;
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println(e.getMessage());
				}
				String s=null;
				System.out.println(s.length());
			System.out.println("other statement");
			}
			catch(NullPointerException e)
			{
			e.printStackTrace();	
			}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
		}
		System.out.println("normal flow..");
		}
}
