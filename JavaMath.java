import java.lang.Math;
class JavaMath
{
	public static void main(String[] args)
	{
		double x=28;
		double y=4;
		
		System.out.println("Maximum number between x & y:"+Math.max(x,y));
		System.out.println("Minimum number between x & y:"+Math.min(x,y));
		System.out.println("Sqrt of y:"+Math.sqrt(y));
		System.out.println("Power of  x & y:"+Math.pow(x,y));
		System.out.println("log of x:"+Math.log(x));
		System.out.println("log of y:"+Math.log(y));
		System.out.println("log base 10 of x:"+Math.log10(x));
		System.out.println("log base 10 of y:"+Math.log10(y));
		System.out.println("log1p of x:"+Math.log1p(x));
		System.out.println("exp of y:"+Math.exp(x));
		System.out.println("exp of y:"+Math.exp(y));
		System.out.println("expm1 of x:"+Math.expm1(y));
	}
}