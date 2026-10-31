import java.util.Scanner;
public class ExamEligibility
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your Marks ");
		int marks = obj.nextInt();
		
		if (marks >= 50)
		{
			System.out.println("Enter your Attedence Percentage ");
		int attendence = obj.nextInt();
		if (attendence >= 75)
			System.out.println("Pass and Eligible");
		}
	}
	
}