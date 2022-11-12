class SetGet
{
	 private int roll;
	 private String name;
	/*SetGet(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}*/
	public int getRoll(int roll)//accessor method or getter method
	{
		return roll;
	}  
	public String getName(String name)
	{
		return name;
	}
	/*public void setDetails(int r,String n)//mutator method or setter method
	{
		this.roll=r;
		this.name=n;
	}
	public void display()
	{
			System.out.println("roll: "+roll+"name: "+name);
	}*/
	public static void main(String[] args)
	{
		SetGet sg=new SetGet();
		SetGet sg2=new SetGet();
		//sg.setDetails(12,"john");
		//sg2.setDetails(13,"mark");
		System.out.println("roll: "+sg.getRoll(123)+"name: "+sg.getName("xyz"));
		System.out.println("roll: "+sg2.getRoll(124)+"name: "+sg2.getName("abc"));
		//sg.display();
		//sg2.display();
	}
}
