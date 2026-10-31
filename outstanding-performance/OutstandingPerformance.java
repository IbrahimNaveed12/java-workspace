import java.util.Scanner;
public class OutstandingPerformance
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt();

        if (marks >= 90) 
		{
            System.out.println("Outstanding Performance");
            if (marks == 100) 
			{
                System.out.println("Perfect Score");
            }
        } 
		

    }
}