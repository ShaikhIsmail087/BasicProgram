interface Bank
{
	float rateOfInterest();
}
class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 7;
	}
}
class PNB implements Bank
{
	public float rateOfInterest()
	{
		return 8;
	}
	public static void main(String[] args)
	{
		Bank d=new SBI();
		System.out.println("ROI:"+d.rateOfInterest());
	}
}