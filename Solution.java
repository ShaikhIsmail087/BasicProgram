import java.util.*;
class Solution<T extends Number&Runnable&Comparable> {
    
    public static void main(String[] args){
		/*ArrayList<?> l=new ArrayList<? extends Number>();
      int[] a={34,98,23,13,1};
	  int temp,j;
	  for(int i=1;i<a.length;i++){
		 temp=a[i];
		 j=i;
		 while(j>0 && a[j-1]>temp){
			 a[j]=a[j-1];
			 j=j-1;
		 }
		 a[j]=temp;
	  }
	  for(int i=0;i<a.length;i++){
		  System.out.print(a[i]+" ");
	  }*/
	    String course=System.getProperty("course");
        if (course.equals("scjp"))
        {
            System.out.println("scjp information");
        }
        else
        {
            System.out.println("Other course information");
        }
    }
}