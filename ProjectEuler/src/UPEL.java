//The Useful Project Euler Library
//Mike Overby v0.1 Sept 21, 2014
public class UPEL
{
	//Pre : limit > 1
	//Post: Returns array in which primes are represented by false.
	public static boolean[] sieveOfEratosthenes(int limit)
	{
		//Create list of consecutive integers. False by default.
		boolean[] primes = new boolean[limit+1];
		
		for (int i = 2; i < primes.length; i++)
		{
			if (primes[i] == false)
				for (int j = 2 * i; j < primes.length; j += i)
					primes[j] = true; //Not prime
		}
		
		return primes;
	}
	
	//Return array of elements that are the smallest prime factor for each index.
	//Based on the Sieve of Eratosthenes.
	//Pre : limit > 1
	//Post: spf[0] and spf[1] are not prime numbers. They are given 1. Do not use this placeholder.
	public static int[] smallestPrimeFactorization(int limit)
	{
		//Allocate array memory
		int[] spf = new int[limit+1];
		
		//Placeholders for nonprimes
		spf[0] = 1;
		spf[1] = 1;
		
		//Mark the rest
		for (int i = 2; i < spf.length; i++)
		{
			//A prime is found
			if (spf[i] == 0)
			{
				//Prime spf is 1
				spf[i] = 1;
				//Mark the multiples of the prime with it as their spf
				for (int j = 2 * i; j < spf.length; j += i)
					if (spf[j] == 0) //Do not override another, smaller spf that has already been imput9999
						spf[j] = i;
			}
		}
		
		return spf;
	}
	
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
