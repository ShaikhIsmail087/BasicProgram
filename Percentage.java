import java.util.Scanner;
class Percentage{
   public static void main(String[] args){
     int Total=600;
     Scanner marks=new Scanner(System.in);
     System.out.println("Enter the Marks: ");
     System.out.println("Marks in Urdu: ");
     int urdu=marks.nextInt();
     System.out.println("Marks in English: ");
     int eng=marks.nextInt();
     System.out.println("Marks in Math: ");
     int math=marks.nextInt();
     System.out.println("Marks in Science: ");
     int sci=marks.nextInt();
     System.out.println("Marks in Hin: ");
     int hin=marks.nextInt();
     System.out.println("Marks in Social Science: ");
     int sos=marks.nextInt();
     int sum=urdu+eng+math+sci+hin+sos;
     System.out.println("Total marks in all Sub:"+sum);
     float percentage=(sum*100.0f)/600.0f;
     System.out.println("The percentage: "+percentage);
     marks.close();
  }
}