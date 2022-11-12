import java.util.concurrent.ThreadLocalRandom;
 class Rand{
  public static void main(String[] args){

//   Random ran=new Random();
   int a=ThreadLocalRandom.current().nextInt();
   int b=ThreadLocalRandom.current().nextInt();
   System.out.println("Randomly generated Integer values: ");
   System.out.println(a);
   System.out.println(b); 

   double c=ThreadLocalRandom.current().nextDouble();
   double d=ThreadLocalRandom.current().nextDouble();
   System.out.println("Randomly generated Double values: ");
   System.out.println(c);
   System.out.println(d);

//   float e=ran.nextFloat();
//   float f=ran.nextFloat();
//   System.out.println("Randomly generated Float values: ");
//   System.out.println(e);
//   System.out.println(f);

/*   long g=ran.nextLong();
   long l=ran.nextLong();
   System.out.println("Randomly generated Long values: ");
   System.out.println(g);
   System.out.println(l);  */

   boolean h=ThreadLocalRandom.current().nextBoolean();
   boolean j=ThreadLocalRandom.current().nextBoolean();
   System.out.println("Randomly generated Boolean values: ");
   System.out.println(h);
   System.out.println(j);
}
}
//there are 4 methods to find random number
//<1>Using Math class in which we have to use pakege with import java.util.Math;
//<2>Using Random method in which we have to use  import java.util.Random pakage;
//<3>Using ThreadLocalRandom class in which we have to use  import java.util.concurrent.ThreadLocalRandom pakage;
//<4>Using ints() method