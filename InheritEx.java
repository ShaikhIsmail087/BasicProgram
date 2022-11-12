class InheritEx
{
	void eat()
	{
		System.out.println("eating...");
	}
	//int age=40;
	//String name="abc";
	//int age1=45;
	//String name1="ab";
}
class Property extends InheritEx
{
	void bark()
	{
		System.out.println("barking...");
	}
	//float salary=250000;
	//float salary1=350000;
}
class newProp extends InheritEx
{
	void wheep()
	{
		System.out.println("wheeping...");
	}
     //float bonus=80000;
     //float bonus1=100000;	 
	public static void main(String[] args)
	{
		//newProp obj=new newProp();
		Property obj=new Property();
		obj.eat();
		obj.bark();
		//newProp obj1=new newProp();
		//System.out.println(obj.age+" "+obj.name+" "+obj.salary+" "+obj.bonus);
		//System.out.println(obj.age1+" "+obj.name1+" "+obj.salary1+" "+obj.bonus1);
	}
}