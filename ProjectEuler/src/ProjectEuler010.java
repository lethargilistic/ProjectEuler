//Find the sum of all the primes below two million.
public class ProjectEuler010
{
	public static long run()
	{
		final int LIMIT = 2_000_000;
		boolean[] primes = UPEL.sieveOfEratosthenes(LIMIT);
		
		//Sum the primes. i starts at 2 to avoid nonprimes
		long sum = 0;
		for(int i = 2; i <= LIMIT; i++)
			if (primes[i] == false)
			{
				sum += i;
			}
	
		return sum;
	}
}
