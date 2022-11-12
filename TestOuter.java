import java.util.*;
class TestOuter
{
	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();
	t.add(new StringBuffer("Z"));
	t.add(new StringBuffer("D"));
	t.add(new StringBuffer("W"));
	t.add(new StringBuffer("B"));
	t.add(new StringBuffer("A"));
	System.out.println(t);
	}
}
class MyComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		
		return 0;
	}
}
