import java.util.*;
class Bakara
{
	public static void main(String[] args)
	{
		DurgaColorfulCalc.add(10,20);
		DurgaColorfulCalc.multiply(10,20);
		Properties p=System.getProperties();
        int cnt=0;
        for (int i=1;i<p.size();i++)
        {
            cnt++;
            p.list(System.out);
        }
        System.out.printf("Total: "+cnt);
	}
}