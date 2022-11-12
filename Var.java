class Var{
  int a=10;
  static int b=20;
  public int add(){
  int c=5,d;
  d=a+b+c;
   System.out.println(d);
   return d;
}
  public int mul(){
  int e=4,f;
  f=a*b*e;
   System.out.println(f);
   return f;
}
public static void main(String[] args){
  System.out.println("Getting instance & static variable: ");
}
}