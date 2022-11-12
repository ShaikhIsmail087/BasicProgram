class Reverse{
  public static void main(String[] args){
    /* String name="Password123";
     String rev="";
     int len=name.length();
     System.out.println("Printing a Reverse Name:");
     for(int i=len-1;i>=0;i--){
         rev=rev+name.charAt(i);
    }
     System.out.println(rev); */
	 double mb=1024*1024;
        Runtime r=Runtime.getRuntime();
        System.out.println("Max memory:"+r.maxMemory()/mb);
        System.out.println("Total memory:"+r.totalMemory()/mb);
        System.out.println("Free memory:"+r.freeMemory()/mb);
        System.out.println("Consumed memory:"+(r.totalMemory()-r.freeMemory())/mb);
	 int no=847632;
	 int rev=0,rem;
	 System.out.println("Printing a Reverse Number:");
	 while(no!=0)
	 {
		 rem=no%10;
		 rev=rev*10+rem;
		 no=no/10;
	 }
	  System.out.println(rev);
  }
}