//import java.io.regex.*;
import java.util.*;
class Str3{
	static String name,id,password;
	static String getName()
	{
		return name;
	}
	static String getId()
	{
		return id;
	}
	static String getPassword()
	{
		return password;
	}
	static void setName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:");
		 name=sc.nextLine();
		if(name.trim().length()==0 || name.trim().isEmpty())
		{
			System.out.println("Name can't be Empty:");
			System.exit(0);
		}
	}
	static void setId()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your id:");
		 id=sc.nextLine();
		if(id.trim().length()==0 || id.trim().isEmpty())
		{
			System.out.println("id can't be Empty:");
			System.exit(0);
		}
	}
	static void setPassword()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your password:");
		 password=sc.nextLine();
		if(password.trim().length()==0 || password.trim().isEmpty())
		{
			System.out.println("password can't be Empty:");
			System.exit(0);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1 to start registeration:");
		int register=sc.nextInt();
		switch(register)
		{
			case 1:setName();
				setId();
				setPassword();
			System.out.println("registeration successfull...");
			System.out.println("---------------------------Your Details-------------------------");
			System.out.println("Applicant Name: "+getName()+
								"\nApplicant Id: "+getId()+
								"\nApplicant Password: "+getPassword());
					break;
			//case 4:System.out.println("registeration success...");
			//		break;
			default:System.out.println("Invalid...");
					break;
		}
	}
}