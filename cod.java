class Code
{
  public static void main(String[] args)
  {
	  String[] argh={"Ismail","Salim","Fazal"};
	  args=argh;
	  for(String s:args)
	  {
		  System.out.println(s+" ");
	  }
	  /*for(int i=0;i<args.length;i++)
	  {
		  System.out.println(args[i]+" ");
	  }*/
	  System.out.println("Length of array : "+args.length);
	 /* int a=1;
	  while(a<=9)
	  {
		  System.out.println(a);
		  a++;
	  }
	  do
	  {
		  System.out.println(a);
		  a--;
	  }
	  while(a>=1); */ 
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(i);
	  }
	  for(int j=9;j>=1;j--)
	  {
		  System.out.println(j);
	  } 
  }
}