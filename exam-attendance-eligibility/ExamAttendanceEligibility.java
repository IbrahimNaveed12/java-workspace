import java.util.Scanner;
public class ExamAttendanceEligibility
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your Attedence Percentage ");
		int attendence = obj.nextInt();
		if (attendence >= 75)
			System.out.println("You are Eligible for the exam");
		
	}
	
}