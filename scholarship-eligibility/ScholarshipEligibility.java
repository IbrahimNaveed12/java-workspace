import java.util.Scanner;

public class ScholarshipEligibility
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter your Marks ");
		int marks = obj.nextInt();
		
		System.out.println("Enter your Attendance Percentage ");
		int attendance = obj.nextInt();
		
		System.out.println("Enter CGPA ");
		float cgpa = obj.nextFloat();
		
		if (marks >= 80 && attendance >= 75 && cgpa >= 3.5)
		{
			System.out.println("Eligible for Scholarship");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}