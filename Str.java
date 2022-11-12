import java.util.*;
class Str
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		int cnt=0;
		int temp=0;
		String[] name=new String[size];
		for(int i=0;i<name.length;i++)
		{
			cnt++;
			temp++;
			System.out.print("Enter "+cnt+" name : ");
			name[i]=sc.next();
			
		}
       /* for(int i=0;i<name.length;i++)
		{
			if(i==name.length-1)
			{
				System.out.print(name[i]);
			}
			else
			{
				System.out.print(name[i]+" , ");
			}
		}	*/	
	}
}