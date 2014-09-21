//Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
//there are exactly 6 routes to the bottom right corner.
//
//How many such routes are there through a 20×20 grid?

public class ProjectEuler015 
{
	//Length of the square, width of the square
	private static long numberOfPaths(int length, int width)
	{    
		//Initialize Ragged array
		int limit = (length*2); //The answer will be on this row
		long[][] pascalTriangle = new long[limit+1][];
		for(int row = 0; row <= limit; row++)
		{
			pascalTriangle[row] = new long[row+1];
		}
		//First values in triangle
		pascalTriangle[0][0] = 1;
		pascalTriangle[1][0] = 1;
		pascalTriangle[1][1] = 1;
		
		for (int row = 2; row < pascalTriangle.length; row++)
		{
			for (int col = 0; col < pascalTriangle[row].length; col++)
			{
				if (col == 0 || col == pascalTriangle[row].length-1)
					pascalTriangle[row][col] = 1;
				else
					pascalTriangle[row][col] = pascalTriangle[row-1][col-1] + pascalTriangle[row-1][col];
			}
		}
		
		return pascalTriangle[length*2][width]; //Actually the width+1, but the array starts at 0.
	}
	
	public static long run()
	{
		return numberOfPaths(20,20);
	}
}
