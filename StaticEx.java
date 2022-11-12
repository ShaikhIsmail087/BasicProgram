class StaticEx
{
	static
	{
		System.out.println("static block executed before main method");
	}
	/*(static int cube(int c)
	{
		return c*c*c;
	}
	int rollNo;
	String name;
	static String collage="ITS";
	//static int count=0;
	//static int display(int c)
	static void change()
	{
	    collage="BBDIT";
	}
	StaticEx(int r, String n)
	{
		rollNo=r;
		name=n;
		//count++;
		//System.out.println(count);
		//return count;
	}
	void display()
	{
		System.out.println(rollNo+" "+name+" "+collage);
	}
}
	class TestStaticEx{*/
	public static void main(String[] args)
	{
		System.out.println("At the time of class loading");
		/*int result=StaticEx.cube(9);
		System.out.println(result);
		StaticEx.change();
		StaticEx s=new StaticEx(101,"abc");
		StaticEx s2=new StaticEx(102,"xyz");
		StaticEx s3=new StaticEx(103,"asd");
		s.display();
		s2.display();
		s3.display();*/
	}
}