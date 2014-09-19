//Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
//where each “_” is a single digit.
public class ProjectEuler206 {
	public static int run()
	{
		//The integer must end in 0 because its square ends in 0.
		//The Square has 19 digits
			//The integer may have 9 digits
				//300_000_000 squared has 18 digits.
				//999_999_999 squared has 19 digits.
		for (int loopCount = 300_000_000; loopCount < 999_999_999; loopCount++)
		{
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println(ProjectEuler206.run());

	}

}
