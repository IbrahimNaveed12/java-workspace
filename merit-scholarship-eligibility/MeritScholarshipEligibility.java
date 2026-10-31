import java.util.Scanner;
public class MeritScholarshipEligibility
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter CGPA ");
		float cgpa = obj.nextFloat();
		
		if (cgpa >= 3.5)
		{
			System.out.println("Enter your Family Income ");
			float income = obj.nextFloat();
		if (income <= 80000)
		{
				System.out.println("Scholarship Eligible");
		}	
		else
			System.out.println("Scholarship Uneligible");
		}
	}
	
}