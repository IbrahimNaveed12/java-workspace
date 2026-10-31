import java.util.Scanner;
public class DistinctionCheck
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        double marks = scanner.nextDouble();

        if (marks >= 50) 
		{
            System.out.println("Passed");
            if (marks >= 80) 
			{
                System.out.println("Distinction");
            }
        } 
		else 
		{
            System.out.println("Failed");
        }

    }
}