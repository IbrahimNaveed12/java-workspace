import java.util.Scanner;
public class PositiveNegative
{
	public static void main(String [] args)
	{
			Scanner obj = new Scanner (System.in);
			int num = obj.nextInt();
			
			if (num >= 0)
			{
				System.out.println( num  + " is a positive number");
				
			}
				else
				{
					System.out.println( num  + " is a negative number");
				}
		
	}
	
}