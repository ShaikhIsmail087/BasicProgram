interface Method
{
	 int multiplyOfTwo(int a,int b);
	 int multiplyOfThree(int a,int b,int c);

}
	class Demo implements Method
	{
		public int multiplyOfTwo(int num1,int num2)
		{
			return num1*num2;
		}
		public int multiplyOfThree(int num1,int num2,int num3)
		{
			return num1*num2*num3;
		}
	public static void main(String[] args)
	{
		Method obj=new Demo();
		System.out.println(obj.multiplyOfTwo(20,10));
		System.out.println(obj.multiplyOfThree(20,10,30));
	}	
}