public class GeneralizedHarmonic
{
	public static void main(String[] args)
	{
		double n = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double num = 0.0;
		for(int i = 1; i <= n; i++)
		{
			num = num + 1/(Math.pow(i,r));
		}
		System.out.println(num);
	}
}