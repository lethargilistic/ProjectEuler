//Find the sum of the digits in the number 100!
import java.math.BigInteger;

public class ProjectEuler020
{
		
	public static long run()
	{
		//Multiply numbers from  1 to 100
		BigInteger num = new BigInteger("1");
		for (int i = 1; i <= 100; i++)
		{
				num = num.multiply(BigInteger.valueOf((i)));
		}
		
		//Convert the result to a string
		String numberString = num.toString();
		
		//Step through the string, summing each digit. That's the answer.
		return UPEL.sumDigits(numberString);
	}
}