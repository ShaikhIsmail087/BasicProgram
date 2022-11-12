import java.util.*;
class Prob{
   public static void main(String[] args){
    /* Scanner sc=new Scanner(System.in);
     System.out.println("Enter any number: ");
     long no=sc.nextLong(); */
 
      for(int i=1;i<=5;i++)
	  {
		  for(int j=1;j<=5;j++)
		  {
			  if(i%2==0 && j%1==0)
			  {
				  System.out.print(" ");
			  }
			  else
			  {
				  System.out.print("*");
			  }
		  }
		  System.out.println();
	  }		
	  /*String no="12345678910";
	  String rem="",temp="";
	  int len=no.length();
	  for(int i=0;i<len;i++)
	  {
		   for(int j=0;j<=len;j++)
		  {
		 temp=rem+no.charAt(i);
		  } 
		  System.out.println(temp);
      } */ 
  }
}