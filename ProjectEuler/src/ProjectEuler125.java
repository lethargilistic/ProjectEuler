import java.util.ArrayList;
import java.util.List;


public class ProjectEuler125 {
	
	public static Long[] getPalindromes(int lim)
	{
		//Get number of digits in limit
		int maxEvenLength = Integer.toString(lim).length() / 2;
		int maxOddLength  = maxEvenLength-1;
		
		int maximumHalf = 9 * (int) Math.pow(10, maxEvenLength);
		
		//Generate Palindromes
		List<Long> palind = new ArrayList<Long>();
		
		//Those less than 100
		for (int i = 1; i < 100; i++)
		{
			palind.add(Long.decode(new String(""+ i + i)));
		}
		//Greater than 100
		for (int outerPart = 1; outerPart < maximumHalf; outerPart++)
		{
			StringBuilder n = new StringBuilder();
			n.append(outerPart);
			//odd length
			for (int innerPart = 1, maxLength = maxEvenLength - (2 * Integer.toString(outerPart).length()); Math.log10(innerPart) < maxLength; innerPart++)
			{
				n.append(innerPart + outerPart);
				palind.add(Long.decode(n.toString()));
				n.delete(Long.toString(outerPart).length()+1, n.length());
			}
			//even length
			palind.add(Long.decode(n.append(outerPart).toString()));
		}
		
		return palind.toArray(new Long[0]);
	}
	
	public static long run()
	{
		final int LIMIT = (int) 10e8;
		
		//Find all palindromic numbers
		Long[] palindromes = getPalindromes(LIMIT);
		//Find all the numbers that are palindromes
	}
}
