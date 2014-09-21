//Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
//where each “_” is a single digit.

import java.math.BigInteger;

public class ProjectEuler206
{
	public static long run()
	{
		//The integer must end in 0 because its square ends in 0.
		//The Square has 19 digits
			//The integer may have 10 digits
				//1_000_000_000 squared has 19 digits. The Square starts with 1.
				//1_430_000_000 squared has 19 digits. The Square starts with 2.
		
		//TODO: Make the "number % 1e5 / 1e4" operation a function. Didn't think of that in time. ^^;
		for (long loopCount = 1_000_000_000L; loopCount < 1_430_000_000L; loopCount+=10) //+ 10 because the integer ends in zero.
		{
			BigInteger number = BigInteger.valueOf(loopCount).multiply(BigInteger.valueOf(loopCount));
			if ((number.mod(BigInteger.valueOf((long)1e3)).divide(BigInteger.valueOf((long)1e2)).equals(BigInteger.valueOf(9))))
			{ //number % 1e3 / 1e2 == 9
				if ((number.mod(BigInteger.valueOf((long)1e5)).divide(BigInteger.valueOf((long)1e4)).equals(BigInteger.valueOf(8))))
				{ //(number % 1e5 / 1e4 == 8)
					if ((number.mod(BigInteger.valueOf((long)1e7)).divide(BigInteger.valueOf((long)1e6)).equals(BigInteger.valueOf(7))))
					{ //number % 1e7 / 1e6 == 7	
						if ((number.mod(BigInteger.valueOf((long)1e9)).divide(BigInteger.valueOf((long)1e8)).equals(BigInteger.valueOf(6))))
						{ //number % 1e9 / 1e8 == 6	
							if ((number.mod(BigInteger.valueOf((long)1e11)).divide(BigInteger.valueOf((long)1e10)).equals(BigInteger.valueOf(5))))
							{ //number % 1e11 / 1e10 == 5	
								if ((number.mod(BigInteger.valueOf((long)1e13)).divide(BigInteger.valueOf((long)1e12)).equals(BigInteger.valueOf(4))))
								{ //number % 1e13 / 1e12 == 4	
									if ((number.mod(BigInteger.valueOf((long)1e15)).divide(BigInteger.valueOf((long)1e14)).equals(BigInteger.valueOf(3))))
									{ //number % 1e15 / 1e14 == 3	
										if ((number.mod(BigInteger.valueOf((long)1e17)).divide(BigInteger.valueOf((long)1e16)).equals(BigInteger.valueOf(2))))
										{ //number % 1e17 / 1e16 == 2	
											if ((number.divide(BigInteger.valueOf((long)1e18)).equals(BigInteger.valueOf(1))))
											{ //number / 1e18 == 1	
												return loopCount;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		//Ensuring that the method returns. This is an error.
		return -1;
	}
}