import java.util.*;
class Book
{
	int id,quantity;
	String name,author,publisher;
	Book(int id,String name,String author,String publisher,int quantity)
	{
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
class Collection
{
	public static void main(String[] args)
	{
		Hashtable h=new Hashtable(25);
		h.put(new Temp(5),"A");
		h.put(new Temp(2),"B");
		h.put(new Temp(6),"C");
		h.put(new Temp(15),"D");
		h.put(new Temp(23),"E");
		h.put(new Temp(16),"F");
		//h.put(new Temp(7),null);
		/*WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"durga");
		System.out.println(m);
		t=null;
		System.gc();
		try{
		Thread.sleep(5000);
		}catch(Exception e){}*/
		System.out.println(h);
	}
}
class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString()
	{
		return i+"";
	}
	
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2){
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
}