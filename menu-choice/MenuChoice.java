import java.util.Scanner;

public class MenuChoice
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("1. Add");
		System.out.println("2. View");
		System.out.println("3. Update");
		System.out.println("4. Exit");
		System.out.println("Enter your choice (1-4): ");
		int choice = obj.nextInt();
		
		switch (choice)
		{
			case 1:
				System.out.println("Add");
				break;
			case 2:
				System.out.println("View");
				break;
			case 3:
				System.out.println("Update");
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
	}
}