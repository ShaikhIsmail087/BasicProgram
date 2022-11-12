class ThisEx
{
	int id;
	String color="white";
	ThisEx(int id,String color)
	{
		this.id=id;
		//this.color=color;
		//System.out.println("running...");
	}
}
class Color extends ThisEx{
	int rate;
     Color(int id,String color,int rate)
	 {
		 super(id,color);
		 this.rate=rate;
	 }
	 void print()
	 {
		 System.out.println(id+" "+color+" "+rate);
	 }
	public static void main(String[] args)
	{
		Color c=new Color(102,"White",45);
		c.print();
		//t.n();
		//new ThisEx().n();
	}
}