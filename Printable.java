interface Printable
{
	void print();
}
interface Showable extends Printable
{
	void show();
}
class Care implements Printable,Showable
{
	public void print()
	{
		System.out.println("printing...");
	}
	public void show()
	{
		System.out.println("Showing...");
	}
	public static void main(String[] args)
	{
		Showable p=new Care();
		p.print();
		p.show();
	}
}