
public class ProjectEuler030
{
	public static boolean isPowerDigitSum(final int num, int power)
	{
		int powerDigitSum = 0;
		int mutableNum = num;
		
		while (!(powerDigitSum > num) && mutableNum > 0)
		{
			int digit = mutableNum % 10; //Get right-most digit of num
			powerDigitSum += Math.pow(digit, power);
			
			mutableNum /= 10; //Remove that digit from num
		}
		
		return powerDigitSum == num;
	}
	
	public static int run()
	{
		int sum = 0;
		//set i to 1 to test if the function works
		for (int i = 100; i < 300000; i++)
		{
			if(isPowerDigitSum(i, 5))
				sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.println(ProjectEuler030.run());
	}
}
