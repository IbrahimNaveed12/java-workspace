import java.util.Scanner;
public class EvenOdd
{
	public static void main(String [] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter an Integer");

		int num = obj.nextInt();
		 if (num % 2 == 0)
			System.out.println("EVEN");

		 else
			System.out.println("ODD");



	}




}