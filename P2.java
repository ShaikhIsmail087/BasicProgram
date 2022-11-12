class P2
{
   public static void main(String[] args)
 {
     for(int i=1;i<=10;i++)
   {
      for(int j=9;j>=i;j--)
	{
         System.out.print(" ");
        }
         for(int k=1;k<=i;k++)
	{
         System.out.print(" *"); 
        } 
    System.out.println();
   }  
    for(int i=1;i<=11;i++)
   {
      for(int j=2;j<=i;j++)
	{
         System.out.print(" ");
        }
         for(int k=11;k>=i;k--)
	{
         System.out.print("* "); 
        } 
    System.out.println();
   } 
 }
}