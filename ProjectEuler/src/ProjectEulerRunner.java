import java.util.Scanner;

public class ProjectEulerRunner
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//TODO: Check if what's entered is actually an int
		System.out.println("Enter Problem Number: ");
		int choice = in.nextInt();
		
		//TODO: Print the answer alongside them.
		switch(choice)
		{
			case 15:
			case 015:
				System.out.println(ProjectEuler015.run());
				break;
				
			case 20:
			case 020:
				System.out.println(ProjectEuler020.run());
				break;
				
			case 30:
			case 030:
				System.out.println(ProjectEuler030.run());
				break;
				
			case 206:
				System.out.println(ProjectEuler206.run());
				break;
				
			default:
				System.out.println("That problem is unsolved.");
		}
	}
}