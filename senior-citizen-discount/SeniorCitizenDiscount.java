import java.util.Scanner;
public class SeniorCitizenDiscount
{
	public static void main(String [] args)
	{
			Scanner obj = new Scanner (System.in);
			System.out.println("Enter your age");
			int age = obj.nextInt();
			
			if (age >= 60)
			{
				System.out.println("20% Senior Citizen Discount");
				
			}
				else
				{
					System.out.println("Regular Ticket Price");
				}
		
	}
	
}