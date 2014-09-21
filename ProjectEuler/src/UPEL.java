//The Useful Project Euler Library
//Mike Overby v0.1 Sept 21, 2014
public class UPEL {
	//Return the sum of all the digits in a number.
	//Pre : The number has been converted to a String before being passed.
	//Post: Returns the sum as a long.
	public static long sumDigits(String number)
	{
		int sum = 0;
		for (int i = 0; i < number.length(); i++)
			sum += Integer.decode(""+number.charAt(i));

		return sum;
	}
}
