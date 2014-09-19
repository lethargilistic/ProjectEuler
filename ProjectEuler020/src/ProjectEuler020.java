import java.math.BigInteger;

public class ProjectEuler020 {
		
	public static int run()
	{
		//Multiply numbers from  1 to 100
		BigInteger num = new BigInteger("1");
		for (int i = 1; i <= 100; i++)
		{
				num = num.multiply(BigInteger.valueOf((i)));
		}
		
		//Convert the result to a string
		String numberString = num.toString();
		
		//Step through the string, summing each digit.
		int sum = 0;
		for (int i = 0; i < numberString.length(); i++)
			sum += Integer.decode(""+numberString.charAt(i));
		
		//Return the sum. That's the answer.
		return sum;
	}
	
	public static void main(String[] args)
	{
		System.out.print(ProjectEuler020.run());
	}
}