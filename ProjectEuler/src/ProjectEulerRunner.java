import java.util.Scanner;

public class ProjectEulerRunner
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//TODO: Check if what's entered is actually an int
		System.out.println("Enter Problem Number: ");
		int choice = in.nextInt();
		in.close();
		
		//TODO: Print the answer alongside them, approximate solve time.
		switch(choice)
		{
			case 15:
				System.out.println("Solve Time: Instant.");
				System.out.println(ProjectEuler015.run() + " (Answer: 137846528820)");
				break;
				
			case 16:
				System.out.println("Solve Time: Unknown.");
				System.out.println(ProjectEuler016.run() + " (Not correct)");
				break;
				
			case 20:
				System.out.println("Solve Time: Unknown.");
				System.out.println(ProjectEuler020.run());
				break;
				
			case 30:
				System.out.println("Solve Time: Unknown.");
				System.out.println(ProjectEuler030.run());
				break;
				
			case 206:
				System.out.println("Solve Time: Unknown.");
				System.out.println(ProjectEuler206.run());
				break;
				
			default:
				System.out.println("That problem is unsolved.");
		}
	}
}