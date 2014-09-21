//What is the sum of the digits of the number 2^1000?
import java.math.BigInteger;

public class ProjectEuler016 {
	public static long run()
	{
		BigInteger n = BigInteger.valueOf(2);
		n = n.pow(1000);
		
		String nString = n.toString();
		return UPEL.sumDigits(nString);
	}
}
