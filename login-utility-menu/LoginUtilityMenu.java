import java.util.Scanner;
public class LoginUtilityMenu
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		String user = "Ali Ahmed";
		int password = 123;
		System.out.println ("Enter Pin: ");
		int pin = obj.nextInt();
		int attempts = 1;
		while (pin != password && attempts <= 3)
		{
			System.out.println ("Incorrect pin Please Enter Correct Pin: ");
			pin = obj.nextInt();
			attempts++;
		}
		if (pin == password )
		System.out.println ("Login Sucessful Welcome " + user);

		
	}
	
}