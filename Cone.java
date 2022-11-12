class Cone{
    int id;
    String name;
    float salary;
    Cone(int i,String n,float s){
	this.id=i;
	this.name=n;
	this.salary=s;
}
  public static void main(String[] args){
	Cone s1=new Cone(101,"abc",35000);
	Cone s2=new Cone(102,"xyz",40000);
	s1.display();
	s2.display();
	
	System.out.println("Id:"+s1.id+" name:"+s1.name+" Emp Salary:"+s1.salary);
	System.out.println("Id:"+s2.id+" name:"+s2.name+" Emp Salary:"+s2.salary);
}
}