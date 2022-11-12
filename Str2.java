class Str2
{
	public static String concatWithString()
	{
		String s="java";
		for(int i=0;i<=10000;i++)
		{
			s=s+"Tpoint";
		}
		return s;
	}
	public static String concatWithStringBuffer()
	{
		StringBuffer sb=new StringBuffer("java");
		for(int i=0;i<=10000;i++)
		{
			sb.append("Tpoint");
		}
		return sb.toString();
	}
	public static void main(String[] args)
	{
		long startTime=System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
		startTime=System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by concating with StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
		
	}
}