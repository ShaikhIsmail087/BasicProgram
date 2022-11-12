class A1
{
	A1 foo()
	{
		return this;
	}
	void print()
	{
		System.out.println("A1 is executed");
	}
}
class A2 extends A1
{
	A1 foo()
	{
		return this;
	}
	void print()
	{
		System.out.println("A2 is executed");
	}
}
class A3 extends A2
{
	A1 foo()
	{
		return this;
	}
	void print()
	{
		System.out.println("A3 is executed");
	}
}
class CovariantExample
{
	public static void main(String[] args)
	{
		A1 a1=new A1();
		a1.foo().print();
		
		A2 a2=new A2();
		a2.foo().print();
		
		A3 a3=new A3();
		a3.foo().print();
		
	}
}