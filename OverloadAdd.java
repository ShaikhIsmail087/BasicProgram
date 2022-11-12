class OverloadAdd
{
	OverloadAdd int add(int n1)
	{
		return n1*n1;
	}
	 OverloadAdd String add(String n1,int n2)
	{
		return n1+n2;
		//System.out.println("2");
	}
	public static void main(String[] args)
	{
		OverloadAdd o=new OverloadAdd();
		//o.add(5);
		//o.add(5,5);
		System.out.println("The sum of 2 component:"+o.add(5));
		System.out.println("The sum of 2 component:"+o.add("dgdy",15));
		//System.out.println("The sum of 3 component:"+OverloadAdd.add(50.2,15.4,200.5));
	} 
}