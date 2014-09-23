//Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

import java.util.Stack;

public class ProjectEuler032 {
	public static boolean haveUniqueDigits(final int firstNum, final int secondNum)
	{
		
		//Do either have repeat digits within themselves?
		int mutableFirst = firstNum;
		String firstNumString = Integer.toString(firstNum);
		for (int i = firstNumString.length()-1; i > 0; i--)
		{
			int digit = mutableFirst % 10;
			String otherDigits = firstNumString.substring(0, i);
			
			if (otherDigits.contains(""+digit))
				return false;
			
			mutableFirst /= 10;
		}
		
		int mutableSecond = secondNum;
		String secondNumString = Integer.toString(secondNum);
		for (int i = secondNumString.length()-1; i > 0; i--)
		{
			int digit = mutableSecond % 10;
			String otherDigits = secondNumString.substring(0, i);
			
			if (otherDigits.contains(""+digit))
				return false;
			
			mutableSecond /= 10;
		}
		
		//Do they share digits?
		//Reset the mutable variables for reuse.
		mutableFirst = firstNum;
		mutableSecond = secondNum;
		
		while(mutableFirst > 0)
		{
			int digit = mutableFirst % 10;
			
			if (secondNumString.contains(""+digit))
				return false;
			
			mutableFirst /= 10;
		}
		
		return true;
	}
	public static int run()
	{
		Stack<Integer> pandigitalProducts = new Stack<Integer>();
		
		//Find the unique pandigital products
		for (int i = 2; i < 100; i++)
			for (int j = 2; j < 9999; j++)
			{				
				int product = i * j;
				if (product < 9876)
				{
					String digits = Integer.toString(i).concat(Integer.toString(j)).concat(Integer.toString(product));
					if (digits.length() == 9 && !digits.contains("0"))
					{
						if(haveUniqueDigits(i, j) && haveUniqueDigits(i, product) && haveUniqueDigits(product, j))
						{
							//Certain pandigital products can be found more than one way. Don't count them twice.
							if (!(pandigitalProducts.search(product) > 0))
							{
								pandigitalProducts.push(product);
							}
						}
					}
				}
			}
		
		//Sum all of the pandigital products
		int sum = 0;
		while (!pandigitalProducts.empty())
			sum += pandigitalProducts.pop();
		
		return sum;
	}
}
