package pack;
//import pack.*;//2)pack.A  
public class A
{
	public void msg()
	{
		System.out.println("Welcome to package");
	}
}
//package mypack;
class B
{
	public static void main(String[] args)
	{
		pack.A b=new pack.A();//3)fully qualified name no need to import
		//A b=new A();
		b.msg();
	}
}
/*import java.util.*;
class PackageInfo{  
public static void main(String args[]){  
   
Package p=Package.getPackage("java.lang");  
  
System.out.println("package name: "+p.getName());  
  
System.out.println("Specification Title: "+p.getSpecificationTitle());  
System.out.println("Specification Vendor: "+p.getSpecificationVendor());  
System.out.println("Specification Version: "+p.getSpecificationVersion());  
  
System.out.println("Implementaion Title: "+p.getImplementationTitle());  
System.out.println("Implementation Vendor: "+p.getImplementationVendor());  
System.out.println("Implementation Version: "+p.getImplementationVersion());  
System.out.println("Is sealed: "+p.isSealed());  
  
  
 }  
}  */