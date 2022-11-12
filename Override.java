class Override
{
	static void draw1()
	{
		System.out.println("method hiding...");
	}
	void draw2()
	{
		System.out.println("drawing...");
	}
}
class Rectangle extends Override
{
	static void draw1()
	{
		System.out.println("method-1 hiding...");
	}
	void draw2()
	{
		System.out.println("drawing rectangle...");
	}
}
class Circle extends Override
{
	static void draw1()
	{
		System.out.println("method-2 hiding...");
	}
	void draw2()
	{
		System.out.println("drawing circle...");
	}
}
class Triangle extends Override
{
	static void draw1()
	{
		System.out.println("method-3 hiding...");
	}
	void draw2()
	{
		System.out.println("drawing traingle...");
	}
	public static void main(String[] args)
	{
		Override o2,o3,o4;
		o2=new Triangle();
		o3=new Circle();
		o4=new Rectangle();
		//method hiding in case of static method(static method can not be overriden)
		o2.draw1();
		o3.draw1();
		o4.draw1();
		
		//method overriding in case of instance method
		o2.draw2();
		o3.draw2();
		o4.draw2();
	}
}