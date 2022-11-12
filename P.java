import java.util.*;
class P{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter number of rows: ");
      int t=0,rows;
      rows=sc.nextInt();
     for(int i=1;i<=rows;i++){
       for(int j=1;j<i+1;j++){
         t=t+1;
       System.out.print(t +" ");
    }
      System.out.println();
   }
 }
}