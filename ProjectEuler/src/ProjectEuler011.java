//What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public final class ProjectEuler011 {

	/**
	 * The structure to hold and access the grid values.
	 */
	private static int[][] grid;
	
	/**
	 * Size of the square grid
	 */
	private final static int GRID_SIZE = 20;
	
	/**
	 * Stores the largest product of four adjacent numbers in the grid.
	 */
	private static int maxProduct = 0;
	
	private static void fillGrid() throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("files/011_input"));
		
		int index = 0;
		while(in.hasNextLine())
		{
			String[] temp = in.nextLine().split(" ");
			for (int j = 0; j < temp.length; j++)
				grid[index][j] = Integer.decode(temp[j]);
		}
	}
	public static long run() throws FileNotFoundException
	{
		//Fill grid
		grid = new int[GRID_SIZE][GRID_SIZE];
		fillGrid();
		
		//Solve all horizontal
		for (int row = 3; row < grid.length; row++)
			for (int col = 3; col < grid[row].length; col++)
			{
				int product = grid[row][col-3] * grid[row][col-2] * grid[row][col-1] * grid[row][col];
				if (product > maxProduct)
					maxProduct = product;
			}
		//Solve all vertical
		
		//Solve all left diagonals
		
		//Solve all right diagonals
	}
}
