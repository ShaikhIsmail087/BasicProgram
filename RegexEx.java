import java.io.*;
import java.util.regex.*;

class RegexEx
{
	public static void main(String[] args)
	{
		/*Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m=p.matcher(args[0]);
		if(m.find() && m.group().equals(args[0]))
		{
			System.out.println("valid gmail id");
		}
		else
		{
			System.out.println("invalid gmail id");
		}*/try{
		PrintWriter out=new PrintWriter("output.txt");
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line=br.readLine();
		while(line != null)
		{
			Matcher m=p.matcher(line);
			while(m.find())
			{
				out.println(m.group());
			}
			line=br.readLine();
		}
		out.flush();
		}catch(Exception e){}
	}
}