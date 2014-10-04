//What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Scanner;

public final class ProjectEuler011
{

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

    private static void fillGrid()
    {
        try
        {
            File file = new File("src/011_Input");
            Scanner in = new Scanner(file);

            int index = 0;
            while (in.hasNextLine())
            {
                String[] temp = in.nextLine().split(" "); // Get next row from file
                for (int j = 0; j < temp.length; j++) // Fill the next row in grid
                {
                    if (temp[j].substring(0, 1).equals("0")) // If there is a leading zero, that makes Integer.decode consider it as an octal
                        grid[index][j] = Integer.decode(temp[j].substring(1)); // Skip leading zero. The numbers are all under 100, so there is no "001" numbers.
                    else
                        grid[index][j] = Integer.decode(temp[j]); // If there is no leading zero, just take the whole number
                }
                
                index++; // Next row
            }

            in.close();
        }
        catch (FileNotFoundException e)
        {
            // System.out.print("Problem 011 File Not Found ");
            // e.printStackTrace();
        }
    }

    public static long run()
    {
        // Fill grid
        // row col
        grid = new int[GRID_SIZE][GRID_SIZE];
        fillGrid();

        // Solve all horizontal
        for (int row = 0; row < grid.length; row++)
            for (int col = 3; col < grid.length; col++)
            {
                int product = grid[row][col - 3] * grid[row][col - 2] * grid[row][col - 1] * grid[row][col];
                if (product > maxProduct)
                    maxProduct = product;
            }

        // Solve all vertical
        for (int col = 0; col < grid.length; col++)
        {
            for (int row = 3; row < grid.length; row++)
            {
                int product = grid[row - 3][col] * grid[row - 2][col] * grid[row - 1][col] * grid[row][col];
                if (product > maxProduct)
                    maxProduct = product;
            }
        }

        // Solve all left diagonals
        for (int col = grid.length-4; col > 0; col--)
        {
            for (int row = 3; row < grid.length; row++)
            {
                int product = grid[row][col] * grid[row - 1][col + 1] * grid[row - 2][col + 2] * grid[row - 3][col + 3];
                if (product > maxProduct)
                    maxProduct = product;
            }
        }
        // Solve all right diagonals
        for (int col = 3; col < grid.length; col++)
        {
            for (int row = 3; row < grid.length; row++)
            {
                int product = grid[row][col] * grid[row - 1][col - 1] * grid[row - 2][col - 2] * grid[row - 3][col - 3];
                if (product > maxProduct)
                    maxProduct = product;
            }
        }
        
        return maxProduct;
    }
}
