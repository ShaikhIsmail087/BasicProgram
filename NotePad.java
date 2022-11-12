class NotePad
{
	private static NotePad varaible=null;
	public String s;
	private NotePad()
	{
		s="Hello i am starting pert of singleton class";
	}
	public static NotePad getInstance()
	{
		if(varaible==null)
			varaible=new NotePad();
		return varaible;
	}
	public static void main(String[] args)
	{
		NotePad x=NotePad.getInstance();
		NotePad y=NotePad.getInstance();
		NotePad z=NotePad.getInstance();
		System.out.println("Hashcode of x is "
                           + x.hashCode());
        System.out.println("Hashcode of y is "
                           + y.hashCode());
        System.out.println("Hashcode of z is "
                           + z.hashCode());
		if(x==y && y==z)
		{
			 System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
		}
		else
		{
			 System.out.println(
                "Three objects DO NOT point to the same memory location on the heap.");
		}
	}
}