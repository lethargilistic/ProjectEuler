//Find the thirteen adrightDigitacent digits in the 1000-digit number that have the greatest product.
//What is the value of this product?
public class ProjectEuler008 {
	private static final int RANGE = 13;
	private static final String SOURCE = "7316717653133062491922511967442657474"
										+ "235534919493496983520312774506326239"
										+ "578318016984801869478851843858615607"
										+ "891129494954595017379583319528532088"
										+ "055111254069874715852386305071569329"
										+ "096329522744304355766896648950445244"
										+ "523161731856403098711121722383113622"
										+ "298934233803081353362766142828064444"
										+ "866452387493035890729629049156044077"
										+ "239071381051585930796086670172427121"
										+ "883998797908792274921901699720888093"
										+ "776657273330010533678812202354218097"
										+ "512545405947522435258490771167055601"
										+ "360483958644670632441572215539753697"
										+ "817977846174064955149290862569321978"
										+ "468622482839722413756570560574902614"
										+ "079729686524145351004748216637048440"
										+ "319989000889524345065854122758866688"
										+ "116427171479924442928230863465674813"
										+ "919123162824586178664583591245665294"
										+ "765456828489128831426076900422421902"
										+ "267105562632111110937054421750694165"
										+ "896040807198403850962455444362981230"
										+ "987879927244284909188845801561660979"
										+ "191338754992005240636899125607176060"
										+ "588611646710940507754100225698315520"
										+ "005593572972571636269561882670428252"
										+ "483600823257530420752963450";
	
	private static long productOfRange(int positionOfRightMostDigit)
	{
		long prod = 1;
		for (int i = positionOfRightMostDigit-RANGE; i < positionOfRightMostDigit; i++)
			prod *= Integer.decode(""+SOURCE.charAt(i));
		
		return prod;
	}
	public static long run()
	{
		//Get the first RANGE digit product
		long largestProduct = productOfRange(RANGE);
		
		//Try the rest of the numbers
		long product = largestProduct;
		for (int rightDigit = RANGE+1; rightDigit < SOURCE.length(); rightDigit++)
		{
			//If there is a zero in the range, product is 0.
			if (SOURCE.substring(rightDigit-RANGE, rightDigit).contains("0"))
			{
				product = 0;
			}
			else
				product = productOfRange(rightDigit);
			
			if (product > largestProduct)
			{
				largestProduct = product;
			}
			
			System.out.println(product);
		}
		return largestProduct;
	}
}
