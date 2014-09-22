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
		
		//TODO: Print approximate solve time.
		switch(choice)
		{
			case 8:
				System.out.println("Solve Time: 96 ms");
				System.out.println(ProjectEuler008.run() + " (Answer: 23514624000)");
				break;
			case 15:
				System.out.println("Solve Time: 0 ms");
				System.out.println(ProjectEuler015.run() + " (Answer: 137846528820)");
				break;
				
			case 16:
				System.out.println("Solve Time: Unrecorded.");
				System.out.println(ProjectEuler016.run() + " (Answer: 1366)");
				break;
				
			case 20:
				System.out.println("Solve Time: Unrecorded.");
				System.out.println(ProjectEuler020.run() + " (Answer: 648)");
				break;
				
			case 30:
				System.out.println("Solve Time: Unrecorded.");
				System.out.println(ProjectEuler030.run() + " (Answer: 443839)");
				break;
			
			case 92:
				System.out.println("Solve Time: Unrecorded.");
				System.out.println(ProjectEuler092.run() + " (Answer: 8581146)");
				break;	
				
			case 206:
				System.out.println("Solve Time: Unrecorded.");
				System.out.println(ProjectEuler206.run() + " (Answer: 1389019170)");
				break;
				
			default:
				System.out.println("That problem is unsolved.");
		}
	}
}