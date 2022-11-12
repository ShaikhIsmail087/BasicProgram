class Forloop{
  public static void main(String[] args){
    int[] marks={34,45,56,67,78,89,94};
    System.out.println(marks.length);
    for (int i=0;i<marks.length;i++){
      System.out.println(marks[i]);
     }
    System.out.println("printing using for loop in reverse order:");
    for (int i=marks.length-1;i>=0;i--){
      System.out.println(marks[i]);
    }
    System.out.println("printing array for-each loop:");
    for (int element:marks){ 
      System.out.println(element);
     }
   }
}