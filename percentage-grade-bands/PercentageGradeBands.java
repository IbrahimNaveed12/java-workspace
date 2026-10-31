import java.util.Scanner;
public class PercentageGradeBands
{
    public static void main(String[] args) 
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter your percentage to check your grade");
		int marks = obj.nextInt();
        if (marks >= 90 && marks <= 100) 
		{
            System.out.println("A+ Grade");
		}
		else if (marks >= 80 && marks <= 89) 
		{
            System.out.println("A Grade");
        }		
        else if (marks >= 70 && marks <= 79) 
		{
            System.out.println("B Grade");
        }
		else if (marks >= 60 && marks <= 69) 
		{
            System.out.println("C Grade");
        }
		else if (marks >= 50 && marks <= 59) 
		{
            System.out.println("D Grade");
        }
		else if (marks < 50 && marks >= 0) 
		{
            System.out.println("F Grade");
        }
		else 
		{
			System.out.println("invalid");
		}

    }
}