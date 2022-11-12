class Bank
{
	int id;
	String name;
	double salary;
	static String add;
	public void m1()
	{
		//this(101,"aba",534733,"jhahh");
		System.out.println("default constructer called.");
	}
	public void n(int i,String n,double s,String a)
	{
		//this();
		id=i;
		name=n;
		salary=s;
		add=a;
		m1();
	}
	public void display()
	{
		System.out.println("id: "+id+" name: "+name+" salary "+salary+" address:"+add);
	}
	public static void main(String[] args)
	{
		Bank b1=new Bank();
		//Bank b2=new Bank();
		b1.n(101,"aba",534733,"jhahh");
		b1.display();
		//b2.display();
	}
}