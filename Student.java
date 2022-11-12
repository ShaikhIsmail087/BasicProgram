class Student implements Cloneable
{
	int id;
	String name;
	Student(int id,String name)
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
		Student s=new Student(10,"absolute");
		Student s1=new Student(101,"absolute zero");
		//try{
		Student s2=(Student)s1.clone();
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