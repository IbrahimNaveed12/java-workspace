import java.util.Scanner;

public class CoursePassFail
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter your Marks ");
		int marks = obj.nextInt();
		
		System.out.println("Enter your Attendance Percentage ");
		int attendance = obj.nextInt();
		
		if (marks >= 50 && attendance >= 75)
		{
			System.out.println("Course Passed");
		}
		else
		{
			System.out.println("Course Failed");
		}
	}
}