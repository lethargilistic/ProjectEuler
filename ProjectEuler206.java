//Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
//where each “_” is a single digit.
public class ProjectEuler206 {
	public static int run()
	{
		//The integer must end in 0 because its square ends in 0.
		//The Square has 19 digits
			//The integer may have 10 digits
				//317_000_000 squared has 19 digits. The Square starts with 1.
				//499_999_999 squared has 19 digits. The Square starts with 2.
		for (long loopCount = 3_170_000_000; loopCount < 4_999_999_999; loopCount+=10)
		{
			number = loopCount * loopCount;
			if (number / 10e18 == 1)
				if ((number / 10e16) % 10 == 2)
					if ((number / 10e14) % 10 == 3)
						if ((number / 10e12) % 10 == 4)
							if ((number / 10e10) % 10 == 5)
								if ((number / 10e8) % 10 == 6)
									if ((number / 10e6) % 10 == 7)
										if ((number / 10e4) % 10 == 8)
											if ((number / 10e2) % 10 == 9)
												return number;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(ProjectEuler206.run());

	}

}
