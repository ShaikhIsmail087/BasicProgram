class Show
//interface Showable
{
	//void show();
	 interface Message// 5->nested interface by interface and class
	{
		void msg();
	}
}
class NestedInterface implements Show.Message
{
	public void msg()
	{
		System.out.println("nested interface...");
	} 
	public static void main(String[] args)
	{
		Show.Message obj=new NestedInterface();
		obj.msg();
	}
}