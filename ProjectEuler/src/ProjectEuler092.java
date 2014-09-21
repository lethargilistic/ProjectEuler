//A number chain is created by continuously adding the square of the digits in a number to form
//a new number until it has been seen before.
//
//What is most amazing is that EVERY starting number will eventually arrive at 1 or 89.
//
//How many starting numbers below ten million will arrive at 89?

public class ProjectEuler092 {
	//True: 89
	//False: 1
	private static boolean[] OneOrEightyNine;
	
	private static boolean numberChain(final int n)
	{
		int mutableN = n;
		while (mutableN != 1 && mutableN != 89)
		{
			int currentNumberInChain = 0;
			while (mutableN > 0)
			{
				//Get right-most digit
				int temp = mutableN % 10;
				
				//Add the square of that digit to 
				currentNumberInChain += temp * temp; 
				
				//Remove the right-most digit
				mutableN /= 10; 
			}
			
			//If we have already calculated this number's terminal point
			if (currentNumberInChain < n)
				return OneOrEightyNine[currentNumberInChain];
			
			mutableN = currentNumberInChain;
		}
		
		if (mutableN == 89)
			return true;
		else
			return false;
	}
	
	public static int run()
	{
		//Allocate memory for the boolean array. +1 so we can ignore the [0] element
		final int LIMIT = 10_000_000;
		OneOrEightyNine = new boolean[LIMIT+1];
	
		//Step through 1 through LIMIT
		for (int i = 1; i <= LIMIT; i++)
		{
			OneOrEightyNine[i] = numberChain(i);
		}
		
		int EightyNineCount = 0;
		for (int j = 1; j <= LIMIT; j++)
			if (OneOrEightyNine[j] == true)
				EightyNineCount++;
		
		return EightyNineCount;
	}
}
