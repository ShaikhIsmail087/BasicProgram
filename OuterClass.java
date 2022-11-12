class OuterClass
{
	int a=10;
	static int b=100;
	private double s=12e4;
	private void m2()
	{
		System.out.println("outer class private method invocation");
	}
	static void m3()
	{
		System.out.println("outer class static method invocation");
	}
	public void m4()
	{
	class Nested
	{
		private double s=12e4;
		public void m1()
		{
			m2();
			m3();
			System.out.println("inner class method invocation "+this.s);
			System.out.println("Private variable="+OuterClass.this.s+" static variable="+b);
			
		}
	}
	Nested n=new Nested();
	n.m1();
	}
	public static void main(String[] args)
	{
		OuterClass o=new OuterClass();
		o.m4();
	}
}
