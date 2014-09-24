//This is unsolved! Incorrect!
//Find the sum of all the numbers less than 108
//that are both palindromic and can be written as the sum of consecutive squares.

import java.util.ArrayList;
import java.util.List;

public class ProjectEuler125 {
	
	//POST: Returns the reverse of num, with a 1 in the left-most position to hold onto zeroes.
	public static long reverse(long num)
	{
		long reverse = 1;
		while (num > 0)
		{
			reverse *= 10;
			reverse += num % 10;
			num /= 10;
		}
		
		return reverse;
	}
	
	//TODO:Refactor to be general. Currently just returns all palindromes to 10e8.
	public static List<Long> getPalindromes()
	{
		//Allocate memory
		List<Long> palind = new ArrayList<Long>();

		//Generate Palindromes
		
		
		//Those less than 100
		for (int i = 1; i < 10; i++)
		{
			palind.add(Long.decode(""+i));
		}
		for (int i = 1; i < 10; i++)
		{
			palind.add(Long.decode(""+ i + i));
		}
		
		//101 to 999
		for (int firstPart = 1; firstPart < 10; firstPart++)
		{
			for (int middlePart = 0; middlePart <= 9; middlePart++)
			{
				palind.add(Long.decode(""+firstPart + middlePart + Long.toString(reverse(firstPart)).substring(1)));
			}
		}
		
		//1001 to 9999 //10000 10e4
		for (int firstHalf = 10; firstHalf < 100; firstHalf++)
		{
			palind.add(Long.decode(""+firstHalf  + Long.toString(reverse(firstHalf)).substring(1)));
		}

		//10001 to 99999 //10e5
		for (int firstPart = 10; firstPart < 100; firstPart++)
		{
			for (int middlePart = 0; middlePart <= 9; middlePart++)
			{
				palind.add(Long.decode(""+firstPart + middlePart + Long.toString(reverse(firstPart)).substring(1)));
			}
		}
		
		//100001 to 999999 //10e6
		for (int firstHalf = 100; firstHalf < 1000; firstHalf++)
		{
			palind.add(Long.decode(""+firstHalf  + Long.toString(reverse(firstHalf)).substring(1)));
		}
		
		//1000001 to 9999999 //10e7
		for (int firstPart = 100; firstPart < 1000; firstPart++)
		{
			for (int middlePart = 0; middlePart <= 9; middlePart++)
			{
				palind.add(Long.decode(""+firstPart + middlePart + Long.toString(reverse(firstPart)).substring(1)));
			}
		}
		
		//10000001 to 99999999 //10e8
		for (int firstHalf = 1000; firstHalf < 10000; firstHalf++)
		{
			palind.add(Long.decode(""+firstHalf  + Long.toString(reverse(firstHalf)).substring(1)));
		}
		
		return palind;
	}
	
	public static long run()
	{
		final long LIMIT = (long) 10e8;
		
		//Find all palindromic numbers
		List<Long> palindromes = getPalindromes();
		
		//Find all the numbers that are sums of consecutive squares.
		long sum = 0;
		
		for (long i = 2; i < Math.sqrt(LIMIT); i++)
		{
			long product = (long) Math.pow(i, 2);
			for (long j = 1; i - j > 0 && product < LIMIT ; j++)
			{
				product += Math.pow(i-j, 2);
				
				if (palindromes.contains(product))
				{
					sum += palindromes.remove(palindromes.indexOf(product));;
					//Remove so that we only count palindromic sums once.
				}
			}
		}
		
		return sum;
	}
}
