class OuterClass
{
	private int data=10;
	class InnerClass
	{
		void msg(){
			System.out.println("data is: "+data);
		}
		public static void main(String[] args)
		{
			OuterClass o=new OuterClass();
			OuterClass.InnerClass in=o.new InnerClass();
			in.msg();
		}
	}
}
