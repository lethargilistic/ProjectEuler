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
		for (int row = 0; row < grid.length; row++)
			for (int col = 3; col < grid[row].length; col++)
			{
				int product = grid[row][col-3] * grid[row][col-2] * grid[row][col-1] * grid[row][col];
				if (product > maxProduct)
					maxProduct = product;
			}
		
		//Solve all vertical
		for (int col = 0; col < grid.length; col++)
			for (int row = 3; row < grid[row].length; row++)
			{
				int product = grid[row-3][col] * grid[row-2][col] * grid[row-1][col] * grid[row][col];
				if (product > maxProduct)
					maxProduct = product;
			}
		
		//Solve all left diagonals
		
		//Solve all right diagonals
	}
}
