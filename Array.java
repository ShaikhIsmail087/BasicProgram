class Array
{
 public static void main(String[] args)
   {
     Array.sum(new int[]{10,20,30});
   }
    static void sum(int[] no){
       int total=0;
       for(int i:no){
      total=total+i;
      }  
     System.out.print("Sum is:"+total); 
   }
} 
 