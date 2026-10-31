import java.util.Scanner;

public class SimpleSwitchCalculator
{
	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		
		System.out.println("Enter first number: ");
		double num1 = obj.nextDouble();
		
		System.out.println("Enter second number: ");
		double num2 = obj.nextDouble();
		
		System.out.println("Enter operator (+, -, *, /): ");
		char op = obj.next().charAt(0);
		
		switch (op)
		{
			case '+':
				System.out.println("Result: " + (num1 + num2));
				break;
			case '-':
				System.out.println("Result: " + (num1 - num2));
				break;
			case '*':
				System.out.println("Result: " + (num1 * num2));
				break;
			case '/':
				if (num2 != 0)
				{
					System.out.println("Result: " + (num1 / num2));
				}
				else
				{
					System.out.println("Error: Division by zero");
				}
				break;
			default:
				System.out.println("Invalid Operator");
				break;
		}
	}
}