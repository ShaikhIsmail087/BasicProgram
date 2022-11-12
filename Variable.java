class Variable{
  static int x=56;
  public static void main(String[] main){
  Variable v=new Variable();
  System.out.println(v.x);
  System.out.println(Variable.x);
  System.out.println(x);
  }
  public void m1(){
  System.out.println(x);
 }
}