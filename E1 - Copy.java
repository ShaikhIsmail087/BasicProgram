class E1{
   public static void main(String[] args){
    int[] a={10,20,30,40,50};
       int temp=0,j=0;
     for(int i=a.length-1;i>0;i--){
        if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;                
         System.out.println("Latgest: "+temp);
	   }
	}     
    }
}