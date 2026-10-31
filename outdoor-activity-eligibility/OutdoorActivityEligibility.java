import java.util.Scanner;

public class OutdoorActivityEligibility
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter your Age: ");
		int age = obj.nextInt();
		
		System.out.println("Enter Temperature: ");
		float temp = obj.nextFloat();
		
		if (age >= 18 && age <= 40 && temp >= 15 && temp <= 35)
		{
			System.out.println("Outdoor Activity Allowed");
		}
		else
		{
			System.out.println("Outdoor Activity Not Recommended");
		}
	}
}