class Outer
{
	private int data=100;
	void call()
	{
		int value=50;
		class Local //3-> Local inner class
		{
			void calling()
			{
				System.out.println("data is: "+value);
			}
		}
		Local i=new Local();
		i.calling();
	}
	public static void main(String[] args)
	{
		Outer o=new Outer();
		o.call();
	}
	
}
