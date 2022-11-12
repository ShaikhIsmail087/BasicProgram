//import java.lang.Cloneable;
public class S implements Cloneable
{
	int id;
	String name;
	S(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	protected Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args)throws CloneNotSupportedException
	{
		S s=new S(10,"absolute");
		S s1=new S(101,"absolute zero");
		//try{
		S s2=(S)s1.clone();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		//}catch(Exception e){
		//	e.printStackTrace();
		//	}
		//System.out.println(s2);
		//s.show();
	}
}
