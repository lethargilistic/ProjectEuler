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
	
	//Pre : limit > 1
	//Post: spf[0] and spf[1] are not prime numbers. They are given 1. Do not use this placeholder.
	public static int[] smallestPrimeFactorization(int limit)
	{
		//Allocate array memory
		int[] spf = new int[limit+1];
		
		//Placeholders for nonprimes
		spf[0] = 1;
		spf[1] = 1;
		
		//Fill the array with primes
		spf[2] = 1;
		spf[3] = 1; //These two's square roots < 1
					//They won't set themselves to 1 because of that.
				
		for (int i = 4; i <= limit; i++)
		{
			if (i % 2 == 0)	//Divisible by 2
				spf[i] = 2;
			else if (UPEL.sumDigits(Integer.toString(i)) % 3 == 0) //Divisible by 3
				spf[i] = 3;
			else if (i % 5 == 0 && i != 5) //Divisible by 5
				spf[i] = 5;
			else if (i % 7 == 0 && i != 7) //Divisible by 7
				spf[i] = 7;
			else
				//Only need to check until the SqRt
				for (int j = 1, limitSqRt = (int) Math.sqrt(i); j <= limitSqRt; j++)
					if (i % j == 0)
					{
						spf[i] = j;
						continue;
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
