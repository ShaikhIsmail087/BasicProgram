import java.util.Scanner;
class Calculater{
  public static void main(String[] args){
    String yn;
    do{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First No: ");
    int no1=sc.nextInt();
    System.out.println("Enter Second No: ");
    int no2=sc.nextInt();
    System.out.println("Selest Symbol(+,-,*,/)");
    String sym=sc.next();
    int res;
    switch(sym){
          case "+":res=no1+no2;
                   System.out.println("Addition is: "+res);
                   break;
          case "-":res=no1-no2;
                   System.out.println("Substraction is: "+res);
                   break;
          case "*":res=no1*no2;
                   System.out.println("Multiplication is: "+res);
                   break;
          case "/":res=no1/no2;
                   System.out.println("Division is: "+res);
                   break;
           default:System.out.println("Invalid Symbol");
                   break;
    }
    System.out.println("Do u want to continue(Press y for Yes and no for No)");
    yn=sc.next();
   }while(yn.equals("y")||yn.equals("Y"));
  }
}