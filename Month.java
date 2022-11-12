import java.util.Scanner;
class Month{
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter any Number: ");
     int month=sc.nextInt();
     int total=31;
     int day=1;
     switch(month){
        case 1:total=total;
               System.out.println("January has "+total+" days.");
               break;
        case 2:total=total-3*day;
               System.out.println("February has "+total+" days.");
               break; 
        case 3:total=total;
               System.out.println("March has "+total+" days.");
               break;
        case 4:total=total-day;
               System.out.println("April has "+total+" days.");
               break;
        case 5:total=total;
               System.out.println("May has "+total+" days.");
               break;
        case 6:total=total-day;
               System.out.println("June has "+total+" days.");
               break;
        case 7:total=total;
               System.out.println("July has "+total+" days.");
               break;
        case 8:total=total;
               System.out.println("August has "+total+" days.");
               break;
        case 9:total=total-day;
               System.out.println("september has "+total+" days.");
               break;
        case 10:total=total;
               System.out.println("October has "+total+" days.");
               break;
        case 11:total=total-day;
               System.out.println("November has "+total+" days.");
               break;
        case 12:total=total;
               System.out.println("December has "+total+" days.");
               break;
        default:System.out.println("Invalid symbol!");
               break;  

   }
 }
}